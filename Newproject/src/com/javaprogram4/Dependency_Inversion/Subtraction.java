package com.javaprogram4.Dependency_Inversion;
public class Subtraction implements Operation {
    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}