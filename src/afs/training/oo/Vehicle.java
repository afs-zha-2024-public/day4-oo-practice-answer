package afs.training.oo;

public class Vehicle {

    private final String name;

    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(int accelerate) {
        this.speed += accelerate;
        System.out.printf("%s: speed up to %d km/h \n", this.name, this.speed);
    }
}
