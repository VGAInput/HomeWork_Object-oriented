package HomeWork_1.transport;

import java.util.Queue;

public class ServiceStation {

    private Queue<Transport_racing> carQueue;

    public ServiceStation(Queue<Transport_racing> carQueue) {
        this.carQueue = carQueue;
    }

    public void addToQueueTruck(Truck truck){
        carQueue.add(truck);
    }
    public void addToQueueCar(LightVehicle lightVehicle){
        carQueue.add(lightVehicle);
    }

    public void offerService(){
        carQueue.poll();
    }
}
