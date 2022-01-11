package com.company;

abstract class Animal{
    public abstract void sound();
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Barks!!");
    }
}

public class ImplementAbstractClassNDMethod{
    public static void main(String[] args) {
        Dog object = new Dog();
        object.sound();
    }
}
