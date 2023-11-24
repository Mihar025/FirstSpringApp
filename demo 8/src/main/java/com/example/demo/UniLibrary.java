package com.example.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends  AbstractLibrary{
    public void getBook(){
        System.out.println("We ordered book from UniLibrary: ");
    }

    public void returnBook(){
        System.out.println("We cancel order and return book into base");
    }


    public void getMagazine(){
        System.out.println("We ordered magazine from UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("We cancel order and return magazine into base");
    }
    public void addBook(){
        System.out.println("We add book into UniLibrary: ");
    }
    public void addMagazine(){
        System.out.println("We add Magazine into UniLibrary: : ");
    }





}

