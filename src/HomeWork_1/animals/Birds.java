package HomeWork_1.animals;

public  class Birds extends Animals{

    private String typeOfMoving;
    public Birds(String habitat, int speed) {
        super(habitat, speed);
    }
    public void hunt(String petName) {
        System.out.println(petName + " идёт на охоту");
    }

    public void setTypeOfMoving(String typeOfMoving) {
        this.typeOfMoving = typeOfMoving;
    }

    public String getTypeOfMoving() {
        return typeOfMoving;
    }
}
