public class Automobile {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Automobile(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand.equals("")) brand = "default";
        if (model == null || model.equals("")) model = "default";
        if (country == null || country.equals("")) country = "default";

        if (engineVolume <= 0) engineVolume = 1.5;

        if (color == null || color.equals("")) color = "Белый";

        if (year <= 0) year = 2000;

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand +
                ", модель: " + model +
                ", обьём двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + year +
                ", страна сборки: " + country;
    }
}
