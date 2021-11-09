package com.lsc.cview.repository;

import com.lsc.cview.entity.McsT0042P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface McsT0042Repository extends JpaRepository<McsT0042P, String> {


    List<McsT0042P> getMcsT0042ByCarrierIdNumber(@Param("carrierIdNumber") String carrierIdNumber);

}
