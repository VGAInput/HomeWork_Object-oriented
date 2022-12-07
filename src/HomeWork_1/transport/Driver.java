package HomeWork_1.transport;

import java.lang.invoke.WrongMethodTypeException;

public class Driver<L extends DrivingLicense> {
    private String driverName;
    private int experienceYears;
    private boolean isLicensed;

    public String getDriverName() {
        return driverName;
    }

    private L licenseClass;

    public Driver(String driverName, int experienceYears, boolean isLicensed) {
        this.driverName = driverName;
        this.experienceYears = experienceYears;
        this.isLicensed = isLicensed;

    }

    public Driver(String driverName, int experienceYears, DrivingLicense drivingLicense) {
        this.driverName = driverName;
        this.experienceYears = experienceYears;
        drivingLicense.getLicenseType("");

    }
    public String getName(){
        return driverName;
    }

    public void startMoving() {
        System.out.println("Водитель начал дижение.");
    }

    public void StopMoving() {
        System.out.println("Водитель останоился.");
    }

    public void refueling() {
        System.out.println("Водитель заправил бак.");
    }

    private void checkDrivingLicense(DrivingLicense drivingLicense) throws WrongMethodTypeException {
        try {
            if (drivingLicense.getLicense().isEmpty() || drivingLicense.getLicense().isBlank()) ;
        } catch (WrongMethodTypeException wmte) {
            System.out.println("Нет лицензии водителя!");
        }

    }
}


