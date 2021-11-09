package com.lsc.cview.repository;

import com.lsc.cview.entity.McsT0041P;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface McsT0041Repository extends JpaRepository<McsT0041P, String> {

    List<McsT0041P> getMcsT0041ByVin(@Param("vin") String vin);
    List<McsT0041P> getMcsT0041ByVinAndLicensePlateNumberAndRegistrationJurisdiction(@Param("vin") String vin, @Param("licensePlateNumber") String licensePlateNumber,
                                                                                     @Param("registrationJurisdiction") String registrationJurisdiction);

}
