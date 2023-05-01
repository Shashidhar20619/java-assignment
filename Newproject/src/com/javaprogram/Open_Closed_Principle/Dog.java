package com.javaprogram.Open_Closed_Principle;

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog make Sounds Woof!");
    }
}
