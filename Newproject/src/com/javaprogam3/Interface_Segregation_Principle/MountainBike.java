package com.javaprogam3.Interface_Segregation_Principle;

public class MountainBike implements Bike {
    @Override
    public void start() {
        System.out.println("Starting Mountain Bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Mountain Bike");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Mountain Bike");
    }

    @Override
    public void brake() {
        System.out.println("Braking Mountain Bike");
    }

    @Override
    public void changeGear() {
        System.out.println("Changing gear of Mountain Bike");
    }

    @Override
    public void pedal() {
        System.out.println("Pedaling Mountain Bike");
    }
}
