package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Pet pet = context.getBean("myPet", Pet.class);
       pet.say();
       context.close();

    }
}
