package com.lcwd.core;

import com.lcwd.core.couple.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lcwd.core","test",})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Animal animal2  = new Cat();
//		Person p1 = new Person(animal2);
//		p1.playWithAnimal();
//		Person p = new Person(animal);
//		p.playWithAnimal();

		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class);
		Person person = context.getBean(Person.class);
		person.playWithAnimal();
		Test testbean = context.getBean(Test.class);
		testbean.testing();


 	}



}
