package HomeWork_1;

import HomeWork_1.transport.*;

import java.util.Collection;

public class HW_1_Main {
    public static void main(String[] args) {

        LightVehicle[] cars = new LightVehicle[]{
                new LightVehicle("Audi","Quattro",2.1),
                new LightVehicle("UAZ","Patriot",2.7),
                new LightVehicle("Honda","Civic",1.8),
                new LightVehicle("Ford","Escape",2.0),
        };
        Bus[] buses = new Bus[]{
                new Bus("PAZ","3205",4.6),
                new Bus("Kamaz","5299-40",4.7),
                new Bus("Volvo","9600",5.0),
                new Bus("Mercedes","Sprinter",3.0),
        };
        Truck[] trucks = new Truck[]{
                new Truck("JAC","HFC1120P91K1D1V",4.6),
                new Truck("Ford","F-750",6.7),
                new Truck("Ural","Next",5.0),
                new Truck("Kamaz","Continent",3.0),
        };

       // LicenseClassB driver1 = new LicenseClassB("Bill Johnson",5, true,cars[1]);
       // LicenseClassC driver2 = new LicenseClassC("Maria Clark",4, true,trucks[3]);
       // LicenseClassD driver3 = new LicenseClassD("John Williamson",2, true,buses[2]);

        Driver<LicenseClassB> driverTom = new Driver<>("Том",5,true);
        Driver<LicenseClassC> driverMaria = new Driver<>("Мария",7,true);
        Driver<LicenseClassD> driverNick = new Driver<>("Николай",4,true);

        System.out.println("Водитель " + driverTom.getDriverName() + " управляет автомобилем " + cars[0].getBrand()
                + " " + cars[0].getModel() + " и будет участвовать в заезде.");

        System.out.println("Водитель " + driverMaria.getDriverName() + " управляет автомобилем " + trucks[0].getBrand()
                + " " + trucks[0].getModel() + " и будет участвовать в заезде.");

        System.out.println("Водитель " + driverNick.getDriverName() + " управляет автомобилем " + buses[0].getBrand()
                + " " + buses[0].getModel() + " и будет участвовать в заезде.");

    }



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
