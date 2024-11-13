package afs.training.oo;

public class Truck {

    private final String name;

    private int speed;

    public static final int ACCELERATE = 2;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += ACCELERATE;
        System.out.printf("%s: speed up to %d km/h \n", this.name, this.speed);
    }
}
