package com.lsc.cview.repository;

import com.lsc.cview.entity.McsT0034UcrRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface McsT0034UCRRegistrationRepository extends JpaRepository<McsT0034UcrRegistration, String> {


    List<McsT0034UcrRegistration> getMcsT0034UcrRegistrationByDotNumberOrderByRegistrationYearDesc(@Param("dotNumber") String dotNumber);

}
