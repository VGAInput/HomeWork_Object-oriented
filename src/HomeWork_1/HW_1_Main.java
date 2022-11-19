package HomeWork_1;

import HomeWork_1.transport.Automobile;

public class HW_1_Main {
    public static void main(String[] args) {

        Human[] people = new Human[]{new Human("Максим", "Минск", 1988, "бренд-менеджер"),
                new Human("Аня", "Москва", 1993, "методист образовательных программ"),
                new Human("Катя", "Калининград", 1992, "продакт-менеджер"),
                new Human("Артем", "Москва", 1995, "директор по развитию бизнеса")};


        Automobile[] automobiles = new Automobile[]{
                new Automobile("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия",5,"Хэтчбэк","а589ло91",5),
                new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный ", 2020, "Германия",6,"Седан","б452не98",5),
                new Automobile("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия",6,"Родстер","а852ке100",4),
                new Automobile("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея",6,"Внедорожник","бо987к91",5),
                new Automobile("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",6,"Седан","в236го78",5)};

        Flower[] flowers = new Flower[]{
                new Flower("Роза обыкновенная", "", "Голландия", 35.59, 3),
                new Flower("Хризантема", "", "", 15, 5),
                new Flower("Пион ", "", "Англия", 69.9, 1),
                new Flower("Гипсофила ", "", "Турция", 19.5, 10)
        };
        /*
        Напишите программу так, чтобы в консоль выводилось приветственное сообщение в формате:
        "Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!" :
        */

        //   for (Human person : people) {
        //       System.out.println("Привет! Меня зовут " + person.getName() + " Я из города " + person.getTown() +
        //               " Я родился в " + person.getYearOfBirth() + " году. Я работаю на должности " +
        //               person.getJobTitle() + ". Будем знакомы!");
        //   }

        /*
        Напишите программу, которая будет выводить в консоль информацию о
        каждом автомобиле и все указанные выше характеристики.
        */

        //   for (Automobile automobile : automobiles) {
        //       System.out.println(automobile.toString());
        //   }

        Human Vladimir = new Human("Владимир", "Казань", 2001, null);

        /*
        Напишите программу, которая выводит информацию по каждому цветку
        со всеми данными: названием, страной происхождения,
        стоимостью и сроком стояния цветка.
        */

        for (Flower flower : flowers) {
            System.out.println(flower.getName() + ":" + " Страна-производитель: " + flower.getCountry() + ", цвет: " +
                    flower.getFlowerColour() + ", стоимостью в " +
                    +flower.getCost() + " рублей, срок стоянияй цветка: " + flower.getLifeSpan() + " д.");
        }

        getBouqetStat(flowers);

    }


    /*
    Напишите программу, с помощью которой можно посчитать
    стоимость букета в зависимости от состава цветов
     в нем и узнать срок стояния букета.
    */

    private static void getBouqetStat(Flower[] flowers){
        double totalPrice = 0;
        int lifeSpan = flowers[0].getLifeSpan();

        System.out.print("Букет состиот из:");

        for (Flower f : flowers) {
            System.out.print(f.getName()+", ");
            totalPrice = totalPrice + f.getCost();
            if (f.getLifeSpan() <= lifeSpan)lifeSpan = f.getLifeSpan();
        }
        totalPrice = totalPrice * 1.1;
        System.out.println("Срок стояния букета: " + lifeSpan + " день, стоимость: " + totalPrice + "р.");

    }
}
