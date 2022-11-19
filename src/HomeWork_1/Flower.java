package HomeWork_1;

public class Flower {

    private String name;
    private String flowerColour;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String name,String flowerColour, String country, double cost, int lifeSpan) {

        if (name == null || name.isEmpty()) name = "Цветок";
        if (flowerColour == null || flowerColour.isEmpty()) flowerColour = "Белый";
        if (country == null || country.isEmpty()) country = "Россия";
        if (cost <= 0) cost = 1.0;
        if (lifeSpan <= 0) lifeSpan = 3;

        this.name = name;
        this.flowerColour = flowerColour;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public String getFlowerColour() {
        return flowerColour;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColour(String flowerColour) {
        this.flowerColour = flowerColour;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
