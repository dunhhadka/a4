package com.example.demo.test.B1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }
    void greets(Dog dog){
        System.out.println("Woooof");
    }
}
