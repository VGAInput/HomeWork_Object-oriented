package HomeWork_1.transport;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bus extends Transport_racing implements Competing {

    private final Set<Mechanic>mechanics;

    public Bus(String brand, String model, double engineVolume,VehicleCategory category,Mechanic mechanic) {
        super(brand, model, engineVolume,category);
        this.mechanics = new HashSet<>(Arrays.asList(mechanic));
    }

    public Set<Mechanic>getMechanics(){
        return mechanics;
    }

    @Override
    public void getVehicleCategory() {
        super.getVehicleCategory();
    }

    @Override
    public void addSponsor(String name, int budget) {
        super.addSponsor(name, budget);
    }

    @Override
    public void determineVehicleCategory(String text) {
        text = "Вместимость автобуса: ";
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
