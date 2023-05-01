package com.javaprogam3.Interface_Segregation_Principle;

public class Key {
	  public static void main(String[] args) {
	        Car sedan = new Sedan();
	        Driver.driveVehicle(sedan);
            System.out.println("----------------------------------");
	        Bike mountainBike = new MountainBike();
	        Driver.driveVehicle(mountainBike);

	    }
}
