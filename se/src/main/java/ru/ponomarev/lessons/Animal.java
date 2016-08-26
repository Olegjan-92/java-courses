package ru.ponomarev.lessons;

/**
 * Created by oleg on 02.08.16.
 */
public class Animal implements Pet{
    private final String name;
    public Animal(final String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
