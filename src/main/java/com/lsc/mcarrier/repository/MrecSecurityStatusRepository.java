package com.lsc.mcarrier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lsc.mcarrier.entity.MrecSecurityStatusEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MrecSecurityStatusRepository extends JpaRepository<MrecSecurityStatusEntity, String> {
}
