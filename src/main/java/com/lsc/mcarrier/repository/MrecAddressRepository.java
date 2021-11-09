package com.lsc.mcarrier.repository;

import com.lsc.mcarrier.entity.MrecAddressEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MrecAddressRepository extends CrudRepository<MrecAddressEntity, String> {
    @Query("Select m from MrecAddressEntity m WHERE UPPER(m.userId) = UPPER(:userId) AND m.addrType = 'UM'")
    List<MrecAddressEntity> getUserAddress(@Param("userId") String userId);
}
