package ru.ponomarev.lessons;

/**
 * Created by oleg on 02.08.16.
 */
public class Dog implements Pet {
    private final Animal animal;
    public Dog(Animal animal){
        this.animal = animal;
    }
    public String getName() {
        return this.animal.getName();
    }
}
