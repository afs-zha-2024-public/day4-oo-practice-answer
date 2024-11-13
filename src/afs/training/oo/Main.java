package afs.training.oo;

// AC1: A bus named “Cool Bus” with a speed of 25 km/h can accelerate(5 km/h every time) and display
// information about the name and speed when speed up, with the following information like: “Cool Bus: speed up to 30 km/h”.
// When get information, will print information: "This is a bus"
// fields: name, speed
// method: speedUp, getInformation

// AC2: A truck named "Big Truck" with a speed of 20 km/h can accelerate(2 km/h every time) and display
// information about the name and speed when speed up, with the following information like: "Big Truck: speed up to 22 km/h".

// AC3: A driver can drive multiple types of vehicles, and can show message with the name and speed when speed up:
// When driver speed up a car named "Cool Bus" with a speed of 25 km/h the message is: “Cool Bus: speed up to 30 km/h”;
// When driver speed up a truck named "Big Truck" with a speed of 20 km/h the message is: “Big Truck: speed up to 22 km/h”
// Object: Driver
// fields: vehicles
// method: speedUp

public class Main {
    public static void main(String[] args) {
//        Bus coolBus = new Bus("Cool Bus", 25);
//        coolBus.speedUp();
//
//        Truck truck = new Truck("Big Truck", 20);
//        truck.speedUp();

        Vehicle bus = new Vehicle("Cool Bus", 25);
        Driver busDriver = new Driver(bus);
        busDriver.speedUp(5);

        Vehicle truck = new Vehicle("Big Truck", 20);
        Driver truckDriver = new Driver(truck);
        truckDriver.speedUp(2);
    }
}