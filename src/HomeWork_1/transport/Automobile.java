package HomeWork_1.transport;

public class Automobile extends Transport {

    private double engineVolume;
    private int gearBox;
    private String bodyType;
    private String regNumber;
    private int availableSeats;

    private class Insurance {
        private int insuranceDuration;
        private int insurancePrice;
        private String insuranceNumber;

        public Insurance(int insuranceDuration, int insurancePrice, String insuranceNumber) {

            if (insuranceDuration <= 0) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
                insuranceDuration = 0;
            }
            ;
            if (insurancePrice <= 0) insurancePrice = 0;
            if (insuranceNumber == null || insuranceNumber.equals("")
                    || insuranceNumber.length() != 9) insuranceNumber = "Номер страховки некорректный!";

            this.insuranceDuration = insuranceDuration;
            this.insurancePrice = insurancePrice;
            this.insuranceNumber = insuranceNumber;
        }
    }

    private class Key {
        private boolean remoteIgnition;
        private boolean remoteKey;

        public Key(boolean remoteIgnition, boolean remoteKey) {
            this.remoteIgnition = remoteIgnition;
            this.remoteKey = remoteKey;
        }
    }


    public Automobile(String brand, String model, double engineVolume, String color, int year, String country,
                      int gearBox, String bodyType, String regNumber, int availableSeats) {

        super(brand, model, year, country, color, engineVolume);

        if (engineVolume <= 0) engineVolume = 1.5;

        this.engineVolume = engineVolume;

        if (gearBox <= 0) gearBox = 4;
        if (availableSeats <= 0) availableSeats = 4;
        if (bodyType == null || bodyType.isEmpty()) bodyType = "Седан";
        if (regNumber == null || regNumber.isEmpty() || regNumber.length() > 9) regNumber = "х000хх000";

        this.gearBox = gearBox;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.availableSeats = availableSeats;

    }

    public double getEngineVolume() {
        return engineVolume;
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

    private boolean tiresType(boolean isWinterTires) {
        return isWinterTires;
    }

    @Override
    public void refill(int fuelType) {
        switch (fuelType) {
            case 0:
                System.out.println("Автомобиль заправлен дизелем");
                break;
            case 1:
                System.out.println("Автомобиль заправлен бензином");
                break;
            case 2:
                System.out.println("Электробатарея автомобиля заряжена");
                break;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() +
                ", модель: " + getModel() +
                ", обьём двигателя: " + engineVolume +
                ", цвет: " + getColor() +
                ", год производства: " + getYear() +
                ", страна сборки: " + getCountry() +
                ", коробка передач: " + gearBox +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + regNumber +
                ", количество мест: " + availableSeats;
    }
}
