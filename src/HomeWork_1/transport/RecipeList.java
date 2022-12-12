package HomeWork_1.transport;

import HomeWork_1.Product;
import HomeWork_1.Recipe;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private Set<Recipe> recipes = new HashSet<>();


    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Этот рецепт уже добавлен.");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        if (!recipes.remove(recipe)) {
            throw new IllegalArgumentException();
        }
    }

}
