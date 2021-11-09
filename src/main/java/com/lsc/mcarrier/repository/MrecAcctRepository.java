package com.lsc.mcarrier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.lsc.mcarrier.entity.MrecAcctEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MrecAcctRepository extends CrudRepository<MrecAcctEntity, String> {
    @Query("SELECT m FROM MrecAcctEntity m WHERE m.msccOrg = :msccOrg AND m.lastUpdtTs IN " +
            "(SELECT MAX(m2.lastUpdtTs) FROM MrecAcctEntity m2 WHERE m.msccOrg = m2.msccOrg)")
    List<MrecAcctEntity> getMrecAccountEntityByMsccOrg(@Param("msccOrg") String msccOrg);
}
