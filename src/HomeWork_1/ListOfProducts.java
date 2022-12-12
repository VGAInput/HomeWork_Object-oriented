package HomeWork_1;

import HomeWork_1.transport.Passport;

import java.time.LocalDate;
import java.util.*;
import java.util.Random;

public class ListOfProducts {

    public static void main(String[] args) throws InvalidPropertiesFormatException {

        List<Product> basket = new ArrayList<>();

        basket.add(new Product(78, "Бананы", 1.5));
        basket.add(new Product(102, "Манго", 0.75));
        basket.add(new Product(38, "Яблоки", 2.0));
        basket.add(new Product(40, "Картошка", 5.0));
        basket.add(new Product(68, "Апельсины", 1.2));

        //  addToBasket(basket,new Product(38, "Яблоки", 2.0));

        Product chicken = new Product(300, "Кур. филе", 0.5);
        Product tomato = new Product(75, "Помидор", 1);
        Product salad = new Product(100, "Салат айсберг", 0.25);
        Product cracker = new Product(20, "Сухарики", 0.25);
        Product cheese = new Product(150, "Сыр", 0.5);

        ArrayList<Product> ingredientsCaesar = new ArrayList<Product>();
        ingredientsCaesar.add(chicken);
        ingredientsCaesar.add(tomato);
        ingredientsCaesar.add(salad);
        ingredientsCaesar.add(cracker);
        ingredientsCaesar.add(cheese);

        Recipe caesar = new Recipe(ingredientsCaesar, 250, "CaesarSalad");

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(caesar);


        // Задание 2.2
        randomNumbers();

        // Задание 3.2
        exercise();

        //Задание 3.3
        checkPassports();

        //Задание 3.5

/*
        В данном случай поиск через HashSet (как и HashMap), поскольку объекты будут рассматриваться
        через их хэш-код, а так же имена-дупликаты будут занимать одно и то же место.

*/



    }

    private static void addToBasket(List<Product> basket, Product product) throws InvalidPropertiesFormatException {
        if (basket.contains(product)) {
            throw new InvalidPropertiesFormatException("Этот продукт уже добавлен.");
        } else basket.add(product);
    }

    private static void checkPassports() {

        Set<Passport> passports = new HashSet<>();

        passports.add(
                new Passport("1569684", "Ivan", "Sergeev", "Antonovich", LocalDate.now().minusYears(45)));
        passports.add(
                new Passport("458627", "Maksim", "Volkov", "Alekseevich", LocalDate.now().minusYears(32)));
        passports.add(
                new Passport("6951786", "Evgeniy", "Altuhov", "Valentinovich", LocalDate.now().minusYears(29)));

        System.out.println(passports);
    }

    private static void randomNumbers() {

        int min = 0;
        int max = 1000;

        List<Integer> randomNums = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNums.add((int) Math.floor(Math.random() * (max - min + 1) + min));

        }

        for (int i = randomNums.size() - 1; i > 0; i--) {
            if (randomNums.get(i) % 2 == 1) randomNums.remove(i);

        }

        for (int i = randomNums.size() - 1; i > 0; i--) {
            System.out.println(randomNums.get(i));
        }

    }

    private static void exercise() {
        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();

        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
            exercises.add(exercise);
            System.out.println(exercise);
        }

    }

}
