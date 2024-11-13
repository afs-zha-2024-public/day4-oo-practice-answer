package afs.training.oo;

public class Truck extends Vehicle {
    public static final int ACCELERATE = 2;

    public Truck(String name, int speed) {
        super(name, speed, ACCELERATE);
    }
}
