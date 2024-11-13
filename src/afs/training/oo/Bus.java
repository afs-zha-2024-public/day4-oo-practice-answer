package afs.training.oo;

public class Bus {

    private final String name;

    private int speed;

    public static final int ACCELERATE = 5;

    public Bus(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += ACCELERATE;
        System.out.printf("%s: speed up to %dkm/h\n", this.name, this.speed);
    }
}
