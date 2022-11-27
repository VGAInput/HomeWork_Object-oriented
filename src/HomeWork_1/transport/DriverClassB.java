package HomeWork_1.transport;

public class DriverClassB extends Driver {
    public DriverClassB(String driverName, int experienceYears, boolean isLicensed, LightVehicle vehicle) {
        System.out.println("водитель " + driverName + " управляет автомобилем " + vehicle.getBrand() + " " + vehicle.getModel()
                + " и будет участвовать в заезде.");
    }
}
