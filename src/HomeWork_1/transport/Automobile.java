package HomeWork_1.transport;

public class Automobile {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    private int gearBox;
    private String bodyType;
    private String regNumber;
    private int availableSeats;

    private class Insurance{
        private int insuranceDuration;
        private int insurancePrice;
        private String insuranceNumber;

        public Insurance(int insuranceDuration, int insurancePrice, String insuranceNumber) {

            if (insuranceDuration <= 0){
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
                insuranceDuration = 0;
            };
            if (insurancePrice <= 0) insurancePrice = 0;
            if (insuranceNumber == null || insuranceNumber.equals("")
            || insuranceNumber.length() != 9) insuranceNumber = "Номер страховки некорректный!";

            this.insuranceDuration = insuranceDuration;
            this.insurancePrice = insurancePrice;
            this.insuranceNumber = insuranceNumber;
        }
    }
    private class Key{
        private boolean remoteIgnition;
        private boolean remoteKey;

        public Key(boolean remoteIgnition, boolean remoteKey) {
            this.remoteIgnition = remoteIgnition;
            this.remoteKey = remoteKey;
        }
    }


    public Automobile(String brand, String model, double engineVolume, String color, int year, String country,
                      int gearBox,String bodyType,String regNumber,int availableSeats) {

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

        if (gearBox <= 0) gearBox = 4;
        if (availableSeats <= 0) availableSeats = 4;
        if (bodyType == null || bodyType.isEmpty()) bodyType = "Седан";
        if (regNumber == null || regNumber.isEmpty() || regNumber.length() > 9) regNumber = "х000хх000";

        this.gearBox = gearBox;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.availableSeats = availableSeats;
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

    public int getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    private boolean tiresType(boolean isWinterTires){
        return isWinterTires;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand +
                ", модель: " + model +
                ", обьём двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + year +
                ", страна сборки: " + country +
                ", коробка передач: " + gearBox +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + regNumber +
                ", количество мест: " + availableSeats;
    }
}
