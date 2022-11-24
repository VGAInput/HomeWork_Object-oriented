package HomeWork_1.animals;

public class Carnivore extends Mammal {

    public Carnivore(String habitat, int speed) {
        super(habitat, speed);
        setFoodType("Meat");
    }

    public void hunt(String petName) {
        System.out.println(petName + " идёт на охоту");
    }
}
