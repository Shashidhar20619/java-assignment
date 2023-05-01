package com.javaprogram.Open_Closed_Principle;

class AnimalSoundMachine1 {
    public void makeAnimalSounds(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

