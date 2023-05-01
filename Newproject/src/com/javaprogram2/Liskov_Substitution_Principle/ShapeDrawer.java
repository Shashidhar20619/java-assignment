package com.javaprogram2.Liskov_Substitution_Principle;

public class ShapeDrawer {
    public void drawShapes(Shape[] shapes) { 
    	/*for-each loop is used to iterate through elements of arrays*/
    	for (Shape shape : shapes) {
            shape.draw();
        }
    }
}