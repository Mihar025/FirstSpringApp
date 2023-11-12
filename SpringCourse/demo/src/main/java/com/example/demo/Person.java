package com.example.demo;

public class Person {
    private Pet pet;
    public Person(Pet pet){
        this.pet = pet;
    }

    public void callyourpet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
