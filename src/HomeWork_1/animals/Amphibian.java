package HomeWork_1.animals;

public class Amphibian extends Animals {
    public Amphibian(String habitat, int speed) {
        super(habitat, speed);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    public void hunt(String petName) {
        System.out.println(petName + " идёт на охоту.");
    }
}
