package afs.training.oo;

public class Bus extends Vehicle {
    public Bus(String name, int speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
    }
}
