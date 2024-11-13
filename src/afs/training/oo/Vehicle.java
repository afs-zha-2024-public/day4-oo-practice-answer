package afs.training.oo;

public class Vehicle {

    private final String name;

    private int speed;

    private final int acceleration;

    public Vehicle(String name, int speed, int acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public void speedUp() {
        this.speed += this.acceleration;
        System.out.printf("%s: speed up to %d km/h \n", this.name, this.speed);
    }
}
