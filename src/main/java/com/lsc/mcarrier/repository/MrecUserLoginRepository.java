package com.lsc.mcarrier.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecUserLoginEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MrecUserLoginRepository extends  JpaRepository<MrecUserLoginEntity, String> {

    @Query("SELECT m from MrecUserLoginEntity  m WHERE UPPER(m.userid) = :userId ORDER BY m.createTs DESC ")
    List<MrecUserLoginEntity> findLatestLogins(@Param("userId") String userId, Pageable pageable);

    @Query("SELECT COUNT(m) from MrecUserLoginEntity  m WHERE UPPER(m.userid) = :userId   ")
    Long findCountByUserId(@Param("userId") String userId);



}
