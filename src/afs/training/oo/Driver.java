package afs.training.oo;

public class Driver {
    private final Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void speedUp(int accelerate) {
        vehicle.speedUp(accelerate);
    }
}