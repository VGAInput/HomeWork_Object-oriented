package HomeWork_1.animals;

public abstract class Herbivorous extends Mammal {

    public Herbivorous(String habitat, int speed) {
        super(habitat, speed);
        setFoodType("Grass");
    }

    public void grazing(String petName){
        System.out.println(petName + " идёт пастись.");
    }
}
