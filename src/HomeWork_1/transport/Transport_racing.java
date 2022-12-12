package HomeWork_1.transport;

import java.lang.invoke.WrongMethodTypeException;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport_racing {

    private String brand;
    private String model;
    private double engineVolume;
    VehicleCategory category;

    private Set<Sponsor> sponsors;

    private boolean checkIfBusCategory(VehicleCategory category) throws WrongMethodTypeException {
        if (category.equals(VehicleCategory.EXTRA_SMALL) ||
                category.equals(VehicleCategory.SMALL) ||
                category.equals(VehicleCategory.MEDIUM) ||
                category.equals(VehicleCategory.LARGE) ||
                category.equals(VehicleCategory.EXTRA_LARGE)) {
            throw new WrongMethodTypeException();
        }
        System.out.println("Категория:" + category.categoryName);
        return true;
    }

    @Override
    public String toString() {
        return "Transport_racing{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", category=" + category +
                ", sponsors=" + sponsors +
                '}';
    }

    public void addSponsor(String name, int budget){
        sponsors.add(new Sponsor(name,budget));
    }

    public void makeDiagnosis(VehicleCategory category) throws WrongMethodTypeException {
        try {
            checkIfBusCategory(category);
        } catch (WrongMethodTypeException wmte) {
            System.out.println("Автобусы не проходят диагностику.");
        } finally {
            System.out.println("Диагностика пройдена.");
        }
    }

    public Transport_racing(String brand, String model, double engineVolume, VehicleCategory category) {

        if (brand == null || brand.equals("")) brand = "default";
        if (model == null || model.equals("")) model = "default";
        if (engineVolume <= 0) engineVolume = 1.5;
        if (category == null) category = VehicleCategory.DATA_MISSING;

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.category = category;

        sponsors = new HashSet<>( );
    }

    public void setSetVehicleCategory(VehicleCategory category) {
        this.category = category;
    }

    public void startMoving() {
    }

    public void endMoving() {

    }

    public void getVehicleCategory() {
        System.out.println(this.category.categoryName);
    }

    public void determineVehicleCategory(String text) {
        System.out.println(text + category.categoryName);
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
