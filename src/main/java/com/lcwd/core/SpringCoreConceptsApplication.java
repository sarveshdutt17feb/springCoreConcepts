package com.lcwd.core;

import com.lcwd.core.couple.Animal;
import com.lcwd.core.couple.Cat;
import com.lcwd.core.couple.Dog;
import com.lcwd.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""})
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
 	}

}
