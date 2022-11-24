package HomeWork_1.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, double topSpeed) {
        super(brand, model, year, country, color, topSpeed);
    }

    @Override
    public void refill(int fuelType) {
        switch (fuelType) {
            case 0:
                System.out.println("Автобус заправлен дизелем");
                break;
            case 1:
                System.out.println("Автобус заправлен бензином");
                break;
        }
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
