package HomeWork_1.transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private double topSpeed;

    public Transport(String brand, String model, int year, String country, String color, double topSpeed) {

        if (brand == null || brand.equals("")) brand = "default";
        if (model == null || model.equals("")) model = "default";
        if (country == null || country.equals("")) country = "default";
        if (color == null || color.equals("")) color = "Белый";
        if (year <= 0) year = 2000;


        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.topSpeed = topSpeed;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    void refill(int fuelType){
        switch (fuelType){
            case 0: System.out.println("Машина заправлена бензином.");
            break;
            case 1: System.out.println("Машина заправлена дизелем.");
            break;
            case 2: System.out.println("Электробатарея машины заряжена.");
            break;
        }
    };

}
