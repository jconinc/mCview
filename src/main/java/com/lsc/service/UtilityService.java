package com.lsc.service;

import com.lsc.model.Register;
import com.lsc.mcarrier.repository.MrecAcctRepository;
import com.lsc.mcarrier.repository.MrecUserPasswordRepository;
import com.lsc.util.AESEncryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lsc.mcarrier.entity.MrecAcctEntity;
import com.lsc.mcarrier.entity.MrecUserEntity;
import com.lsc.mcarrier.entity.MrecUserPasswordEntity;
import com.lsc.mcarrier.repository.MrecUserRepository;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    @Autowired
    MrecUserRepository userRepository;

    @Autowired
    MrecUserPasswordRepository passwordRepository;

    @Autowired
    MrecAcctRepository mrecAcctRepository;

    public String generateUniqueMsccOrg() {
        String msccOrg = generateRandomNumberString(8);
        try {
            boolean isUnique = false;
            while(!isUnique) {
                if(isUniqueMsccOrg(msccOrg)) {
                    isUnique = true;
                } else {
                    msccOrg = generateRandomNumberString(8);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msccOrg;
    }

    public String generateUniqueUserId(Register register) {

        String userId = "MCE" +
                register.getFirst_name().toUpperCase().charAt(0) +
                register.getLast_name().toUpperCase().charAt(0) +
                generateRandomNumberString(3);

        try {
            boolean isUnique = false;
            while (!isUnique) {
                if (isUniqueUserid(userId)) {
                    isUnique = true;
                } else {
                    userId = "MCE" +
                            register.getFirst_name().toUpperCase().charAt(0) +
                            register.getLast_name().toUpperCase().charAt(0) +
                            generateRandomNumberString(3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userId;
    }

    public String generateUniquePassword(String userId) {
        String password = "MCEP@ss" + generateRandomNumberString(7);
        try {
            List<MrecUserPasswordEntity> userPasswordEntityList = passwordRepository.findPasswordsByUserId(userId);
            if (!userPasswordEntityList.isEmpty()) {
                boolean isUnique = false;
                while(!isUnique) {
                    if (isUniquePassword(userId,password)) {
                        isUnique = true;
                    } else {
                        password = "MCEP@ss" + generateRandomNumberString(7);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return password;
    }

    public boolean isUniqueMsccOrg(String msccOrg) {
        boolean isUnique = true;
        try {
            List<MrecAcctEntity> mrecAcctEntityList = mrecAcctRepository.getMrecAccountEntityByMsccOrg(msccOrg);
            if (!mrecAcctEntityList.isEmpty()) {
                isUnique = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUnique;
    }

    public boolean isUniqueUserid(String userId) {
        boolean isUnique = true;
        try {
            List<MrecUserEntity> mrecUserEntityList = userRepository.getMrecUserEntityByUserId(userId);
            if (!mrecUserEntityList.isEmpty()) {
                isUnique = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUnique;
    }

    public boolean isUniquePassword(String userId, String uniquePassword) {
        boolean isUniquePassword = true;
        try {
            AESEncryption AESencrp = new AESEncryption();
            List<MrecUserPasswordEntity> mrecUserPasswordEntityList = passwordRepository.findPasswordsByUserId(userId);
            for (MrecUserPasswordEntity mrecUserPasswordEntity : mrecUserPasswordEntityList) {
                String pass = AESencrp.decrypt(mrecUserPasswordEntity.getPassword());
                if (pass.equals(uniquePassword)) {
                    isUniquePassword = false;
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return isUniquePassword;
    }

    public String generateRandomNumberString(int lengthOfString) {
        StringBuilder numberString = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < lengthOfString; i++) {
            int value = rand.nextInt(10);
            numberString.append(value);
        }
        return numberString.toString();
    }

    public Timestamp getTimestampNow() {
        Calendar cal = Calendar.getInstance();
        long ts = cal.getTimeInMillis();
        return new Timestamp(ts);
    }

    public Timestamp getTimestampPlusDays(int days) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +days);
        long ts = cal.getTimeInMillis();
        return new Timestamp(ts);
    }
}

