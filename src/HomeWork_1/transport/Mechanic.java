package HomeWork_1.transport;

public class Mechanic {

    String name;
    String company;


    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;

    }

    public void maintenance(LightVehicle lightVehicle) {
        System.out.println(lightVehicle.getBrand() + " " + lightVehicle.getModel() + " is maintained.");
    }

    public void maintenance(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " is maintained.");

    }

    public void maintenance(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " is maintained.");

    }

    public void fixVehicle(LightVehicle lightVehicle) {
        System.out.println(lightVehicle.getBrand() + " " + lightVehicle.getModel() + " is fixed.");
    }

    public void fixVehicle(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " is fixed.");
    }

    public void fixVehicle(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " is fixed.");
    }
}
