package com.javaprogram2.Liskov_Substitution_Principle;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}