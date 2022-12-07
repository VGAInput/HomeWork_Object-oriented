package HomeWork_1.transport;

public class Sponsor {
    private String name;
    private int budget;

    public Sponsor(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public void fundRace(){

    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
