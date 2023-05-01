package com.javaprogram4.Dependency_Inversion;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int x, int y) {
        return operation.perform(x, y);
    }
}