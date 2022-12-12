package HomeWork_1;

import java.util.Objects;

public class Product {
    private int price;
    private String name;
    private double ammountKilogramm;

    public Product(int price, String name, double ammountKilogramm) throws IllegalArgumentException {

        if (price == 0 || ammountKilogramm == 0.0 || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        }

        this.price = price;
        this.name = name;
        this.ammountKilogramm = ammountKilogramm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Double.compare(product.ammountKilogramm, ammountKilogramm) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, ammountKilogramm);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmmountKilogramm(double ammountKilogramm) {
        this.ammountKilogramm = ammountKilogramm;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getAmmountKilogramm() {
        return ammountKilogramm;
    }
}
