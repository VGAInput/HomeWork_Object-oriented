package HomeWork_1;

import HomeWork_1.transport.Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CheckPassports {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();

        passports.add(
                new Passport("1569684", "Ivan", "Sergeev", "Antonovich", LocalDate.now().minusYears(45)));
        passports.add(
                new Passport("458627", "Maksim", "Volkov", "Alekseevich", LocalDate.now().minusYears(32)));
        passports.add(
                new Passport("6951786", "Evgeniy", "Altuhov", "Valentinovich", LocalDate.now().minusYears(29)));

        System.out.println(passports);



/*

        Задание 3.4

        В данном случай поиск через HashSet (как и HashMap), поскольку объекты будут рассматриваться
        через их хэш-код, а так же имена-дупликаты будут занимать одно и то же место.

*/

    }
}
