package afs.training.oo;

public class ElectricEngine implements Engine {
    public static final int ACCELERATION = 5;

    @Override
    public int getAcceleration() {
        return ACCELERATION;
    }
}