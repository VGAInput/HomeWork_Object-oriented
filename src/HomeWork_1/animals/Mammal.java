package HomeWork_1.animals;

public class Mammal extends Animals{

    public Mammal(String habitat, int speed) {
        super(habitat,speed);
    }
    public Mammal(String habitat, int speed,String name) {
        super(habitat,speed);
        setPetName(name);
    }

    public void walk(String name){
        System.out.println(name + " идёт гулять.");
    }

}
