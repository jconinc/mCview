package com.lsc.service;

import com.lsc.model.Account;
import com.lsc.model.Register;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KeycloakService {

    @Value("${keycloak.auth-server-url}")
    private String authServerURL;

    @Value("${custom.keycloak.masterRealm}")
    private String masterRealm;

    @Value("${custom.keycloak.masterResource}")
    private String masterClientId;

    @Value("${custom.keycloak.masterResourceSecret}")
    private String masterClientSecret;

    @Value("${keycloak.realm}")
    private String realm;

    public Keycloak getInstance() {
        return KeycloakBuilder.builder()
                .serverUrl(authServerURL)
                .realm(masterRealm)
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
                .clientId(masterClientId)
                .clientSecret(masterClientSecret)
                .resteasyClient(new ResteasyClientBuilder().connectionPoolSize(10).build()) .build();
    }

    public String getAuthServerURL() {
        return authServerURL;
    }

    public String getMasterRealm() {
        return masterRealm;
    }

    public String getMasterClientId() {
        return masterClientId;
    }

    public String getMasterClientSecret() {
        return masterClientSecret;
    }

    public String getRealm() {
        return realm;
    }

    public UserRepresentation getUserRepresentationByUserName(UsersResource usersResource, String userId) {
        UserRepresentation userRepresentation = null;
        try {
            List<UserRepresentation> userList = usersResource.search(userId);
            for (int i = 0; i < userList.size(); i++) {
                userRepresentation = userList.get(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userRepresentation;
    }

    public void updateUser(Account account, String userId) {
        Keycloak keycloak = null;
        try {
            keycloak = getInstance();
            UsersResource usersResource = keycloak.realm(getRealm()).users();
            UserRepresentation user = getUserRepresentationByUserName(usersResource,userId);
            UserResource userResource = usersResource.get(user.getId());
            user.setFirstName(account.getEntries().getFirstName().toUpperCase());
            user.setLastName(account.getEntries().getLastName().toUpperCase());
            userResource.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (keycloak != null && !keycloak.isClosed()) {
                keycloak.close();
            }
        }
    }

    public Response createUser(Timestamp tsNow, String userId, Register register, String unencryptedPassword) {
        Response response = null;
        Keycloak keycloak = null;
        try {
            keycloak = getInstance();

            //POPULATE CREDENTIALS
            CredentialRepresentation credential = new CredentialRepresentation();
            credential.setType(CredentialRepresentation.PASSWORD);
            credential.setValue(unencryptedPassword);
            credential.setTemporary(true);
            credential.setCreatedDate(tsNow.getTime());

            //POPULATE USER MAIN FIELDS
            UserRepresentation user = new UserRepresentation();
            user.setUsername(userId.toUpperCase());
            user.setFirstName(register.getFirst_name().toUpperCase());
            user.setLastName(register.getLast_name().toUpperCase());
            user.setEmail(register.getEmail().toUpperCase());

            //POPULATE USER ATTRIBUTE FIELDS
            Map<String, List<String>> attributes = new HashMap<>();
            attributes.put("middle_name", Arrays.asList(register.getMiddle_name().toUpperCase()));
            attributes.put("sq_1", Arrays.asList(register.getSq_1().toUpperCase()));
            attributes.put("sq_2", Arrays.asList(register.getSq_2().toUpperCase()));
            attributes.put("sq_3", Arrays.asList(register.getSq_3().toUpperCase()));
            attributes.put("sa_1", Arrays.asList(register.getSa_1().toUpperCase()));
            attributes.put("sa_2", Arrays.asList(register.getSa_2().toUpperCase()));
            attributes.put("sa_3", Arrays.asList(register.getSa_3().toUpperCase()));
            attributes.put("address_1", Arrays.asList(register.getAddress_1().toUpperCase()));
            attributes.put("address_2", Arrays.asList(
                    (register.getAddress_2() != null && register.getAddress_2().trim().length() > 0) ?
                            register.getAddress_2().toUpperCase() : ""));
            attributes.put("city", Arrays.asList(register.getCity().toUpperCase()));
            attributes.put("jurisdiction", Arrays.asList(register.getJurisdiction().toUpperCase()));
            attributes.put("postal_code", Arrays.asList(register.getPostal_code().toUpperCase()));
            attributes.put("country", Arrays.asList(register.getCountry().toUpperCase()));
            attributes.put("phone", Arrays.asList(
                    (register.getPhone() != null && register.getPhone().trim().length() > 0) ?
                            register.getPhone().toUpperCase() : ""));
            attributes.put("phone_ext", Arrays.asList(
                    (register.getPhone_ext() != null && register.getPhone_ext().trim().length() > 0) ?
                            register.getPhone_ext().toUpperCase() : ""));

            //SET ATTRIBUTES
            user.setAttributes(attributes);

            //SET CREDENTIALS
            user.setCredentials(Arrays.asList(credential));

            //ENABLE THE USER
            user.setEnabled(true);

            response = keycloak.realm(getRealm()).users().create(user);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (keycloak != null && !keycloak.isClosed()) {
                keycloak.close();
            }
        }
        return response;
    }

}
