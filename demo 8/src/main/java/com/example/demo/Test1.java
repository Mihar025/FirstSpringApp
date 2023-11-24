package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class Test1 {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

  UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
  //  Book book = context.getBean("book", Book.class);

    unilibrary.getBook();
    unilibrary.getMagazine();
    //unilibrary.returnMagazine();
   // unilibrary.addBook();







    context.close();




    }
}