package com.javaprogram2.Liskov_Substitution_Principle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();

        ShapeDrawer drawer = new ShapeDrawer();
        drawer.drawShapes(shapes);
    }
}