package HomeWork_1.animals;

public class Amphibian extends Animals{
    public Amphibian(String habitat, int speed) {
        super(habitat, speed);
    }

    public void hunt(String petName){
        System.out.println(petName + " идёт на охоту.");
    }
}
