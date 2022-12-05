package HomeWork_1.transport;

public class DrivingLicense{

    private String license;
    public String getLicenseType(String licenseClass){
        license = licenseClass;
        return licenseClass;
    };
    public String getLicense(){
        return this.license;
    }
}
