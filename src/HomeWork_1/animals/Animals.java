package HomeWork_1.animals;

public abstract class Animals {

    private String petName;
    private int age;
    private String habitat;
    private int speed;
    private String foodType;

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Animals(String habitat, int speed) {
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFoodType() {
        return foodType;
    }

}
