package com.javaprogam3.Interface_Segregation_Principle;


public class Driver {
    public static void driveVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.accelerate();
      
        if (vehicle instanceof Bike) {
            ((Bike) vehicle).changeGear();
        }
        else {
        	System.out.println("This vehicle does not have gears to change.");
        }
        vehicle.brake();
        vehicle.stop();
    }
}