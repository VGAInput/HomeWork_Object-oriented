package HomeWork_1.transport;

public class Bus  extends Transport{
    public Bus(String brand, String model, int year, String country, String color, double topSpeed) {
        super(brand, model, year, country, color, topSpeed);
    }

    @Override
    void refill(int fuelType) {
        super.refill(fuelType);
    }



    public String toString() {
        return "Марка автобуса: " + getBrand() +
                ", модель: " + getModel() +
                ", максимальная скорость: " + getTopSpeed() +
                ", цвет: " + getColor() +
                ", год производства: " + getYear() +
                ", страна сборки: " + getCountry() +
                ".";
    }
}
