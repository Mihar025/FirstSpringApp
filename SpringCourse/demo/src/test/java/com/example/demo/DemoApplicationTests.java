package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Pet pet = context.getBean("myPet", Pet.class);
       pet.say();
       context.close();

*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		Pet pet = context.getBean("myPet", Pet.class);

		Person person = new Person(pet);
		person.callyourpet();


	}

}
