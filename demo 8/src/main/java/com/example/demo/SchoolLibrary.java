package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We ordered book from School library");
    }
    public void returnBook(){
        System.out.println("We canceled order from SchoolLibrary");
    }


}
