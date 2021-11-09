package com.lsc.mcarrier.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecUserAccountEntity;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MrecUserAccountRepository extends CrudRepository<MrecUserAccountEntity,String> {
    @Query("SELECT m FROM MrecUserAccountEntity m WHERE UPPER(m.userId) = UPPER(:userId)")
    List<MrecUserAccountEntity> getByUserId(@Param("userId") String userId);

    @Query("SELECT m FROM MrecUserAccountEntity m where m.userId = :userId and m.organizationRole = 'CONTRIBUTOR'")
    List<MrecUserAccountEntity> getContributorByUserId(@Param("userId") String userId);

    @Query("SELECT m FROM MrecUserAccountEntity m where m.userId = :userId and m.organizationRole = 'OWNER'")
    List<MrecUserAccountEntity> getOwnedByUserId(@Param("userId") String userId);

    @Transactional
    @Modifying
    @Query("UPDATE MrecUserAccountEntity m SET m.updateTs = :tsNow WHERE UPPER(m.userId) = UPPER(:userId) AND m.msccOrg = :msccOrg")
    void setActive(@Param("tsNow") Timestamp tsNow, @Param("userId") String userId, @Param("msccOrg") String msccOrg);
}
