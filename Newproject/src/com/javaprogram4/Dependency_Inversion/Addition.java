package com.javaprogram4.Dependency_Inversion;

public class Addition implements Operation {
  
    public int perform(int x, int y) {
        return x + y;
    }
}