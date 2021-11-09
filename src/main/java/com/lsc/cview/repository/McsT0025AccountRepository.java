package com.lsc.cview.repository;

import com.lsc.cview.entity.McsT0025Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface McsT0025AccountRepository extends JpaRepository<McsT0025Account, String> {


    List<McsT0025Account> getMcsT0025AccountByIftaCarrierIdNumber(@Param("iftaCarrierNumber") String iftaCarrierNumber);

}
