package HomeWork_1.transport;

public class LightVehicle extends Transport_racing implements Competing {

    public LightVehicle(String brand, String model, double engineVolume,VehicleCategory category) {
        super(brand, model, engineVolume,category);

    }

    @Override
    public void getVehicleCategory() {
        super.getVehicleCategory();
    }

    @Override
    public void determineVehicleCategory(String text) {
        text = "Тип авитомобиля: ";
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
