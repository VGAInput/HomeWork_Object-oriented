package HomeWork_1.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private String number;
    private String name;
    private String surname;
    private String patronicName;
    private LocalDate birthday;

    public Passport(String number, String name, String surname, String patronicName, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronicName = patronicName;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronicName() {
        return patronicName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronicName(String patronicName) {
        this.patronicName = patronicName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(patronicName, passport.patronicName) && Objects.equals(birthday, passport.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, surname, patronicName, birthday);
    }
}
