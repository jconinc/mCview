package com.lsc.mcarrier.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecSecurityQuestionsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MrecSecurityQuestionsRepository extends  JpaRepository<MrecSecurityQuestionsEntity, String> {

    @Query("SELECT m from MrecSecurityQuestionsEntity  m WHERE m.userid = :userId order by  m.createTs desc ")
    List<MrecSecurityQuestionsEntity> findByUserId(@Param("userId") String userId, Pageable pageable);

    @Query("SELECT m from MrecSecurityQuestionsEntity  m WHERE m.userid = :userId order by  m.createTs desc ")
    List<MrecSecurityQuestionsEntity> findByUserId(@Param("userId") String userId);

    @Query("SELECT a FROM MrecSecurityQuestionsEntity a WHERE a.userid = :userId AND a.createTs in (select max(b.createTs) from MrecSecurityQuestionsEntity b where a.userid = b.userid)")
    List<MrecSecurityQuestionsEntity> findLatestSecurityQuestionsByUserId(@Param("userId") String userId);

    @Modifying
    @Query("UPDATE MrecSecurityQuestionsEntity c SET c.userid = ?1 WHERE c.userid= ?2 ")
    void setNewUserId(String newUserId, String oldUserId);

    @Query("SELECT COUNT(m) from MrecSecurityQuestionsEntity  m WHERE m.userid = :userid ")
    Long findCountByUserId(@Param("userid") String userid);

    @Modifying
    @Query("DELETE FROM MrecSecurityQuestionsEntity c WHERE c.userid = :userId ")
    int deleteByUserId(@Param("userId") String userId);

}
