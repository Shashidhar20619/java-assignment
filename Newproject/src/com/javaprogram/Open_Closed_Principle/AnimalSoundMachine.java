package com.javaprogram.Open_Closed_Principle;

public class AnimalSoundMachine {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        AnimalSoundMachine1 machine = new AnimalSoundMachine1();
        machine.makeAnimalSounds(animals);
    }
}
