package HomeWork_1.transport;

public class DriverClassC extends Driver {
    public DriverClassC(String driverName, int experienceYears, boolean isLicensed, Truck vehicle) {
        System.out.println("водитель " + driverName + " управляет автомобилем " + vehicle.getBrand() + " " + vehicle.getModel()
                + " и будет участвовать в заезде.");
    }
}
