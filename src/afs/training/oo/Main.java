package afs.training.oo;

// AC1: A bus named “Cool Bus” with a speed of 25 km/h can accelerate(5 km/h every time) and display
// information about the name and speed when speed up, with the following information like: “Cool Bus: speed up to 30 km/h”.
// When get information, will print information: "This is a bus"
// fields: name, speed
// method: speedUp, getInformation

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25);
        coolBus.speedUp();
    }
}