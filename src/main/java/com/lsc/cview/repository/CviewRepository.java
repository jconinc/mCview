package com.lsc.cview.repository;

import com.lsc.cview.entity.McsT0025Account;
import com.lsc.cview.entity.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.lsc.model.CarrierVehicleVinContainer;

import java.util.List;

@Repository
public interface CviewRepository extends JpaRepository<McsT0031Carrier, String> {

    List<McsT0031Carrier> getMcsT0031CarrierByCarrierNameLike(@Param("carrierName") String carrierName, Pageable pageable);
    List<McsT0031Carrier> getMcsT0031CarrierByCarrierNameLikeAndState(@Param("carrierName") String carrierName, @Param("state") String state, Pageable pageable);

    Long countMcsT0031CarrierByCarrierNameLike(@Param("carrierName") String carrierName);
    Long countMcsT0031CarrierByCarrierNameLikeAndState(@Param("carrierName") String carrierName, @Param("state") String state);

    List<McsT0031Carrier> getMcsT0031CarrierByDbaNameLike(@Param("dbaName") String dbaName, Pageable pageable);
    List<McsT0031Carrier> getMcsT0031CarrierByDbaNameLikeAndState(@Param("dbaName") String dbaName, @Param("state") String state, Pageable pageable);

    Long countMcsT0031CarrierByDbaNameLike(@Param("dbaName") String dbaName);
    Long countMcsT0031CarrierByDbaNameLikeAndState(@Param("dbaName") String dbaName, @Param("state") String state);

    List<McsT0031Carrier> getMcsT0031CarrierByCarrierIdNumber(@Param("carrierIdNumber") String carrierIdNumber, Pageable pageable);
    List<McsT0031Carrier> getMcsT0031CarrierByCarrierIdNumberAndState(@Param("carrierIdNumber") String carrierIdNumber, @Param("state") String state, Pageable pageable);

    Long countMcsT0031CarrierByCarrierIdNumber(@Param("carrierIdNumber") String carrierIdNumber);
    Long countMcsT0031CarrierByCarrierIdNumberAndState(@Param("carrierIdNumber") String carrierIdNumber, @Param("state") String state);

    List<McsT0031Carrier> getMcsT0031CarrierByTaxIdNumber(@Param("taxIdNumber") String taxIdNumber, Pageable pageable);
    List<McsT0031Carrier> getMcsT0031CarrierByTaxIdNumberAndState(@Param("taxIdNumber") String taxIdNumber, @Param("state") String state, Pageable pageable);

    Long countMcsT0031CarrierByTaxIdNumber(@Param("taxIdNumber") String taxIdNumber);
    Long countMcsT0031CarrierByTaxIdNumberAndState(@Param("taxIdNumber") String taxIdNumber, @Param("state") String state);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId WHERE v.vin LIKE :vin ")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierByVin(@Param("vin") String vin, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId WHERE v.vin LIKE :vin AND m.state = :state")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierByVinAndState(@Param("vin") String vin, @Param("state") String state, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId WHERE v.vin LIKE :vin ")
    Long countMcsT0031CarrierByVin(@Param("vin") String vin);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId WHERE v.vin LIKE :vin AND m.state = :state")
    Long countMcsT0031CarrierByVinAndState(@Param("vin") String vin, @Param("state") String state);


    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            " WHERE r.licensePlateNumber LIKE  :licensePlateNumber ")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierByPlate(@Param("licensePlateNumber") String licensePlateNumber, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            " WHERE r.licensePlateNumber LIKE :licensePlateNumber AND r.irpBaseState = :irpBaseState")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierByPlateAndState(@Param("licensePlateNumber") String licensePlateNumber, @Param("irpBaseState") String irpBaseState, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            " WHERE r.licensePlateNumber LIKE :licensePlateNumber ")
    Long countMcsT0031CarrierByPlate(@Param("licensePlateNumber") String licensePlateNumber);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            " WHERE r.licensePlateNumber LIKE :licensePlateNumber AND r.irpBaseState  = :irpBaseState")
    Long countMcsT0031CarrierByPlateAndState(@Param("licensePlateNumber") String licensePlateNumber, @Param("irpBaseState") String irpBaseState);

    ///

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE r.licensePlateNumber LIKE  :licensePlateNumber ")
    List<CarrierVehicleVinContainer> getMcsT0031WithVinCarrierByPlate(@Param("licensePlateNumber") String licensePlateNumber, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE r.licensePlateNumber LIKE :licensePlateNumber AND r.irpBaseState = :irpBaseState")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierWithVinByPlateAndState(@Param("licensePlateNumber") String licensePlateNumber, @Param("irpBaseState") String irpBaseState, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(r, v) from  McsT0028Registration r   " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE r.licensePlateNumber LIKE :licensePlateNumber AND r.irpBaseState = :irpBaseState")
    List<CarrierVehicleVinContainer> getVehicleWithVinByPlateAndState(@Param("licensePlateNumber") String licensePlateNumber, @Param("irpBaseState") String irpBaseState, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE r.licensePlateNumber LIKE :licensePlateNumber ")
    Long countMcsT0031CarrierWithVinByPlate(@Param("licensePlateNumber") String licensePlateNumber);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE r.licensePlateNumber LIKE :licensePlateNumber AND r.irpBaseState  = :irpBaseState")
    Long countMcsT0031CarrierWithVinByPlateAndState(@Param("licensePlateNumber") String licensePlateNumber, @Param("irpBaseState") String irpBaseState);


    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber =  :carrierIdNumber AND (r.irpCarrierIdNumber = :carrierIdNumber " +
            " OR (r.safetyCarrier = :carrierIdNumber AND r.irpCarrierIdNumber is null)) AND r.regId IN (SELECT MAX(r1.regId) FROM McsT0028Registration  r1 " +
            " WHERE r1.safetyCarrier = r.safetyCarrier AND r.registrationExpireDate > CURRENT_TIMESTAMP AND r.licensePlateNumber = r1.licensePlateNumber " +
            " AND r.irpBaseState = r1.irpBaseState) ")
    List<CarrierVehicleVinContainer> getRegistrantsVehiclesByCarrierId(@Param("carrierIdNumber") String carrierIdNumber);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber =  :carrierIdNumber AND r.safetyCarrier = :carrierIdNumber " +
            "  AND r.regId IN (SELECT MAX(r1.regId) FROM McsT0028Registration  r1 " +
            " WHERE r1.safetyCarrier = r.safetyCarrier AND r.registrationExpireDate > CURRENT_TIMESTAMP AND r.licensePlateNumber = r1.licensePlateNumber " +
            " AND r.irpBaseState = r1.irpBaseState) ")
    List<CarrierVehicleVinContainer> getSafetyVehiclesByCarrierId(@Param("carrierIdNumber") String carrierIdNumber);


    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierName LIKE  :carrierName ")
    List<CarrierVehicleVinContainer> getMcsT0031WithVinCarrierByCarrierLegalName(@Param("carrierName") String carrierName, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierName LIKE  :carrierName AND m.state = :state")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierWithVinByCarrierLegalNameAndState(@Param("carrierName") String carrierName, @Param("state") String state, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierName LIKE :carrierName ")
    Long countMcsT0031CarrierWithVinByCarrierLegalName(@Param("carrierName") String carrierName);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierName LIKE :carrierName AND m.state  = :state")
    Long countMcsT0031CarrierWithVinByCarrierLegalNameAndState(@Param("carrierName") String carrierName, @Param("state") String state);




    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.dbaName LIKE  :dbaName ")
    List<CarrierVehicleVinContainer> getMcsT0031WithVinCarrierByCarrierDBAName(@Param("dbaName") String dbaName, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.dbaName LIKE  :dbaName AND m.state = :state")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierWithVinByCarrierDBANameAndState(@Param("dbaName") String dbaName, @Param("state") String state, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.dbaName LIKE :dbaName ")
    Long countMcsT0031CarrierWithVinByCarrierDBAName(@Param("dbaName") String dbaName);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.dbaName LIKE :dbaName AND m.state  = :state")
    Long countMcsT0031CarrierWithVinByCarrierDBANameAndState(@Param("dbaName") String dbaName, @Param("state") String state);




    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber LIKE  :carrierIdNumber ")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierWithVinByCarrierIdNumber(@Param("carrierIdNumber") String carrierIdNumber, Pageable pageable);

    @Query("SELECT new com.lsc.model.CarrierVehicleVinContainer(m, r, v) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber LIKE  :carrierIdNumber AND m.state = :state")
    List<CarrierVehicleVinContainer> getMcsT0031CarrierWithVinByCarrierIdNumberAndState(@Param("carrierIdNumber") String carrierIdNumber, @Param("state") String state, Pageable pageable);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber LIKE :carrierIdNumber ")
    Long countMcsT0031CarrierWithVinByCarrierIdNumber(@Param("carrierIdNumber") String carrierIdNumber);

    @Query("SELECT COUNT(m) from McsT0031Carrier  m INNER JOIN McsT0028Registration r ON r.safetyCarrier = m.carrierIdNumber " +
            "INNER JOIN McsT0028Vin v ON v.vehId = r.vehId  WHERE m.carrierIdNumber LIKE :carrierIdNumber AND m.state  = :state")
    Long countMcsT0031CarrierWithVinByCarrierIdNumberAndState(@Param("carrierIdNumber") String carrierIdNumber, @Param("state") String state);



}
