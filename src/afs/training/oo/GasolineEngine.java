package afs.training.oo;

public class GasolineEngine implements Engine {
    public static final int ACCELERATION = 2;

    @Override
    public int getAcceleration() {
        return ACCELERATION;
    }
}