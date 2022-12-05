package HomeWork_1.transport;

import java.lang.invoke.WrongMethodTypeException;

public class Truck extends Transport_racing implements Competing{

    public Truck(String brand, String model, double engineVolume,VehicleCategory category) {
        super(brand, model, engineVolume,category);
    }

    @Override
    public void getVehicleCategory() {
        super.getVehicleCategory();
    }

    @Override
    public void makeDiagnosis(VehicleCategory category) throws WrongMethodTypeException {
        super.makeDiagnosis(category);
    }

    @Override
    public void determineVehicleCategory(String text) {
        text = "Грузоподъёмность грузовика: ";
        super.determineVehicleCategory(text);
    }

    @Override
    public void pitStop() {
        System.out.println(getModel() + " остановаился на пит-стоп.");
    }

    @Override
    public void bestLapTime(double seconds) {
        System.out.println(getModel() + " лучшее время: " + seconds);

    }

    @Override
    public void topSpeed(double kilometersPerHour) {
        System.out.println("Лучшее время:" + kilometersPerHour);
    }
}
