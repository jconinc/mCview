package com.lsc.model;
import com.lsc.cview.entity.McsT0031Carrier;
import com.lsc.cview.entity.McsT0028Registration;
import com.lsc.cview.entity.McsT0028Vin;
public class CarrierVehicleVinContainer {

    private McsT0031Carrier carrier;
    private McsT0028Registration registration;
    private McsT0028Vin vin;

    public CarrierVehicleVinContainer(){

    }
    public CarrierVehicleVinContainer(McsT0031Carrier carrier, McsT0028Registration registration, McsT0028Vin vin) {
        this.carrier = carrier;
        this.registration = registration;
        this.vin = vin;
    }
    public CarrierVehicleVinContainer(McsT0028Registration registration, McsT0028Vin vin) {
        this.registration = registration;
        this.vin = vin;
    }

    public CarrierVehicleVinContainer(McsT0031Carrier carrier, McsT0028Registration registration) {
        this.carrier = carrier;
        this.registration = registration;

    }

    public McsT0031Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(McsT0031Carrier carrier) {
        this.carrier = carrier;
    }

    public McsT0028Registration getRegistration() {
        return registration;
    }

    public void setRegistration(McsT0028Registration registration) {
        this.registration = registration;
    }

    public McsT0028Vin getVin() {
        return vin;
    }

    public void setVin(McsT0028Vin vin) {
        this.vin = vin;
    }
}
