package HomeWork_1.transport;

public class Train  extends Transport{

    private int tripPrice;
    private int tripTime;
    private String departureStationName;
    private String endStationName;
    private int numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, double topSpeed, int tripPrice,
                 int tripTime, String departureStationName,String endStationName,int numberOfWagons) {
        super(brand, model, year, country, color, topSpeed);

        setTripPrice(tripPrice);
        setTripTime(tripTime);
        setDepartureStationName(departureStationName);
        setEndStationName(endStationName);
        setNumberOfWagons(numberOfWagons);

    }

    @Override
    public String toString() {
        return "Поезд " + getModel() + ", Модель: " + getModel() + ", Год выпуска" +getYear()+
                "В стране: " +getCountry() + ", скорость передвижения: " + getTopSpeed() +
                "км/ч, отходит от: " + departureStationName + ", до: " + endStationName + "." +
                " Цена поездки: " + tripPrice+ " рублей, в поезде " + getNumberOfWagons() + " вагонов.";
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public void setEndStationName(String endStationName) {
        this.endStationName = endStationName;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public int getTripTime() {
        return tripTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndStationName() {
        return endStationName;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }
}
