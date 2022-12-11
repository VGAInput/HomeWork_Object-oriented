package HomeWork_1;

import java.util.ArrayList;
import java.util.Objects;

public class Recipe {

    private ArrayList<Product>products;
    private double totalPrice;
    private String recipeName;

    public Recipe(ArrayList<Product> products, double totalPrice, String recipeName) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.recipeName = recipeName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.totalPrice, totalPrice) == 0 && Objects.equals(products, recipe.products) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, totalPrice, recipeName);
    }
}
