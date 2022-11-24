package HomeWork_1.animals;

public class FlightlessBird extends Birds{
    public FlightlessBird(String habitat, int speed) {
        super(habitat, speed);
        setTypeOfMoving("Ходит");
    }


    public void walking(String name){
        System.out.println(name + " идёт гулять.");
    }
}
