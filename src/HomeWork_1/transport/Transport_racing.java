package HomeWork_1.transport;

public abstract class Transport_racing {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport_racing(String brand, String model, double engineVolume) {

        if (brand == null || brand.equals("")) brand = "default";
        if (model == null || model.equals("")) model = "default";
        if (engineVolume <= 0) engineVolume = 1.5;

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void startMoving() {
    }

    public void endMoving(){

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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
}
