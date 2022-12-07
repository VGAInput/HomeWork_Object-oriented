package HomeWork_1;

import HomeWork_1.transport.*;

import java.util.*;

public class HW_1_Main {


    Queue<String> queueFirst = new ArrayDeque<>(5);
    Queue<String> queueSecond = new ArrayDeque<>(5);

    public static void main(String[] args) {

        chessMatrix();

/*
        Sponsor sponsor1 = new Sponsor("Fuel", 15000);
        Sponsor sponsor2 = new Sponsor("CANON", 25000);
        Sponsor sponsor3 = new Sponsor("LEGO", 10000);

        ArrayList<LightVehicle> lightVehicles = new ArrayList<>();

        lightVehicles.add(new LightVehicle("Audi", "Quattro", 2.1, VehicleCategory.HATCHBACK));
        lightVehicles.add(new LightVehicle("UAZ", "Patriot", 2.7, VehicleCategory.OFFROAD));
        lightVehicles.add(new LightVehicle("Honda", "Civic", 1.8, VehicleCategory.SEDANE));
        lightVehicles.add(new LightVehicle("Ford", "Escape", 2.0, VehicleCategory.HATCHBACK));

        ArrayList<Bus> buses = new ArrayList<>();

        buses.add(new Bus("PAZ", "3205", 4.6, VehicleCategory.EXTRA_LARGE));
        buses.add(new Bus("Kamaz", "5299-40", 4.7, VehicleCategory.MEDIUM));
        buses.add(new Bus("Volvo", "9600", 5.0, VehicleCategory.MEDIUM));
        buses.add(new Bus("Mercedes", "Sprinter", 3.0, VehicleCategory.SMALL));

        ArrayList<Truck> trucks = new ArrayList<>();

        trucks.add(new Truck("JAC", "HFC1120P91K1D1V", 4.6, VehicleCategory.N1));
        trucks.add(new Truck("Ford", "F-750", 6.7, VehicleCategory.N2));
        trucks.add(new Truck("Ural", "Next", 5.0, VehicleCategory.N3));
        trucks.add(new Truck("Kamaz", "Continent", 3.0, VehicleCategory.N1));


        Driver<LicenseClassB> driverTom = new Driver<>("Том", 5, true);
        Driver<LicenseClassC> driverMaria = new Driver<>("Мария", 7, true);
        Driver<LicenseClassD> driverNick = new Driver<>("Николай", 4, true);

        buses.get(0).addSponsor(sponsor1.getName(), sponsor1.getBudget());*/
    }

    private void queueTask() {

        queueFirst.add("Randy");
        queueFirst.add("Tom");
        queueFirst.add("Bill");

        queueSecond.add("Mick");
        queueSecond.add("Anna");
        queueSecond.add("Jill");
        queueSecond.add("Jenny");

        addToShortestQueue("Michael");

    }

    private void addToShortestQueue(String s) {

        if (queueSecond.size() == queueFirst.size()) {
            System.out.println("Call Galya for help.");
        } else if (queueFirst.size() <= queueSecond.size()) {
            queueFirst.add(s);
        } else {
            queueSecond.add(s);
        }
    }

    private static void chessMatrix(){

        List<List<Character>> biDemArrList = new ArrayList<>();

        //int ourNumber = biDemArrList.get(0).get(1);

        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j,'0');
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 7) System.out.print("\n");
                System.out.print(biDemArrList.get(i).get(j) + "*");
            }
        }
    }

}
