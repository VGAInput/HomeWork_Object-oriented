package HomeWork_1.transport;

import java.lang.invoke.WrongMethodTypeException;

public abstract class Transport_racing {

    private String brand;
    private String model;
    private double engineVolume;
    VehicleCategory category;

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
