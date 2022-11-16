public class Main {

    public static void main(String[] args) {

        Human[] people = new Human[]{new Human("Максим", "Минск", 1988,"бренд-менеджер"),
                new Human("Аня", "Москва", 1993,"методист образовательных программ"),
                new Human("Катя", "Калининград", 1992,"продакт-менеджер"),
                new Human("Артем", "Москва", 1995,"директор по развитию бизнеса")};

        Automobile[] automobiles = new Automobile[]{
                new Automobile("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия"),
                new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный ", 2020, "Германия"),
                new Automobile("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия"),
                new Automobile("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея"),
                new Automobile("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея")
        };

        /*
        Напишите программу так, чтобы в консоль выводилось приветственное сообщение в формате:
        "Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!" :
        */

        for (Human person : people) {
            System.out.println("Привет! Меня зовут " + person.getName() + " Я из города " + person.getTown() +
                    " Я родился в " + person.getYearOfBirth() + " году. Я работаю на должности " +
                    person.getJobTitle() + ". Будем знакомы!");
        }

        /*
        Напишите программу, которая будет выводить в консоль информацию о
        каждом автомобиле и все указанные выше характеристики.
        */

        for (Automobile automobile : automobiles) {
            System.out.println(automobile.toString());
        }

    }
}