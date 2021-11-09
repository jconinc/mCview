package com.lsc.mcarrier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecUserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MrecUserRepository extends JpaRepository<MrecUserEntity, String> {

    @Query("SELECT m FROM MrecUserEntity m WHERE m.userId = :userId")
    List<MrecUserEntity> getMrecUserEntityByUserId(@Param("userId") String userId);

    @Query("SELECT m FROM MrecUserEntity m WHERE UPPER(m.email) = UPPER(:email)")
    List<MrecUserEntity> getMrecUserEntityByEmail(@Param("email") String email);

    @Query("SELECT m FROM MrecUserEntity m WHERE UPPER(m.userId) = UPPER(:userId) AND m.updateTs IN " +
            "(SELECT MAX(m1.updateTs) FROM MrecUserEntity m1 where UPPER(m1.userId) = UPPER(m.userId)) ")
    List<MrecUserEntity> getLatestMrecUserEntityByUserId(@Param("userId") String userId);

    @Query("SELECT m FROM MrecUserEntity m WHERE UPPER(m.email) = UPPER(:email) AND m.updateTs IN " +
            "(SELECT MAX(m1.updateTs) FROM MrecUserEntity m1 where UPPER(m1.email) = UPPER(m.email)) ")
    List<MrecUserEntity> getLatestMrecUserEntityByEmail(@Param("email") String email);

    /*@Modifying
    @Query("DELETE FROM MrecUserEntity c WHERE c.userId = :userId AND c.updateTs = :updateTs  ")
    int deleteByUserIdAndUpdateTimestamp(@Param("userId") String userId,  @Param("createTs") Timestamp updateTs);*/
}
