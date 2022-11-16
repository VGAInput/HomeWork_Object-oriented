public class Human {

    private int yearOfBirth;
    private String name;
    private String town;
    private String notAvailable = "Информация не указана";

    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {

        if (name == null || name.equals(""))name = notAvailable;
        if (town == null || town.equals(""))town = notAvailable;
        if (jobTitle == null || jobTitle.equals(""))jobTitle = notAvailable;
        if (yearOfBirth == 0 )yearOfBirth = 1900;

        this.name = name;
        this.town = town;
        this.yearOfBirth = Math.abs(yearOfBirth); //год рождения не может быть отрицательным
        this.jobTitle = jobTitle;

    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null)jobTitle = "Информация не указана";

        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
