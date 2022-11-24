package HomeWork_1.animals;

public class FlyingBird extends Birds{
    public FlyingBird(String habitat, int speed) {
        super(habitat, speed);
        setTypeOfMoving("Летает");
    }

    public void walking(String name){
        System.out.println(name + " вылетает на прогулку.");
    }
}
