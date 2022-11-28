package HomeWork_1.transport;

public class Driver <L extends DrivingLicense> {
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

    public void startMoving() {
        System.out.println("Водитель начал дижение.");
    }

    public void StopMoving() {
        System.out.println("Водитель останоился.");
    }

    public void refueling() {
        System.out.println("Водитель заправил бак.");
    }
}


