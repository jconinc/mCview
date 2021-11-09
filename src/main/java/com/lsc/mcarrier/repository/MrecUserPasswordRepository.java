package com.lsc.mcarrier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecUserPasswordEntity;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MrecUserPasswordRepository extends JpaRepository<MrecUserPasswordEntity, String> {

    @Query("SELECT m from MrecUserPasswordEntity m WHERE m.userid = :userId order by m.createTs desc ")
    List<MrecUserPasswordEntity> findByUserId(@Param("userId") String userId);

    @Modifying
    @Query("UPDATE MrecUserPasswordEntity c SET c.userid = ?1 WHERE c.userid = ?2 ")
    void setNewUserId(String newUserId, String oldUserId);

    @Query("SELECT m from MrecUserPasswordEntity m WHERE m.userid = :userId AND m.createTs IN " +
            "(select MAX(ms.createTs) FROM MrecUserPasswordEntity ms WHERE ms.userid = :userId ) ")
    List<MrecUserPasswordEntity> findLatestPasswordByUserId(@Param("userId") String userId);

    @Query("SELECT m from MrecUserPasswordEntity m WHERE m.userid = :userId")
    List<MrecUserPasswordEntity> findPasswordsByUserId(@Param("userId") String userId);

    @Query("SELECT m from MrecUserPasswordEntity  m WHERE m.userid = :userId AND " +
            "m.createTs IN (select MAX(ms.createTs) FROM MrecUserPasswordEntity ms WHERE ms.userid = :userId) ")
    MrecUserPasswordEntity findLatestUserByUserId(@Param("userId") String userId);

    @Modifying
    @Query("DELETE FROM MrecUserPasswordEntity c WHERE c.userid = :userId AND c.createTs = :createTs  ")
    int deleteByUserIdAndCreateTimestamp(@Param("userId") String userId,  @Param("createTs") Timestamp createTs);


}
