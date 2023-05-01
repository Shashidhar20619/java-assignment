package com.javaprogam3.Interface_Segregation_Principle;


public class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Starting Sedan");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sedan");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Sedan");
    }

    @Override
    public void brake() {
        System.out.println("Braking Sedan");
    }

   
}