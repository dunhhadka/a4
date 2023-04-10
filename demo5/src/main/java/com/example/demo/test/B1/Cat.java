package com.example.demo.test.B1;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Meow");
    }
}
