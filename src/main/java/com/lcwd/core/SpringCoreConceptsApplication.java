package com.lcwd.core;

import com.lcwd.core.couple.*;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;
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
//Application context represents spring container
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class);
//		Person person = context.getBean(Person.class);
//		person.playWithAnimal();
//		Test testbean = context.getBean(Test.class);
//		testbean.testing();

		//Bean Scope
		//first request for pepsi bean
//		Pepsi bean  = context.getBean(Pepsi.class);
//		System.out.println(bean);
//		bean.drink();
		//second request for
//		Pepsi 	bean1 = context.getBean(Pepsi.class);
//		System.out.println(bean1);

//		Pepsi pepsi = 	context.getBean(Pepsi.class);
//		System.out.println(pepsi);
//		Soda soda = pepsi.getSoda();
//		System.out.println(soda);
//
//		Pepsi pepsi1 = 	context.getBean(Pepsi.class);
//		System.out.println(pepsi1);
//		Soda soda1 = pepsi.getSoda();
//		System.out.println(soda1);
//
//		Pepsi pepsi2 = 	context.getBean(Pepsi.class);
//		System.out.println(pepsi2);
//		Soda soda2 = pepsi.getSoda();
//		System.out.println(soda2);



	}



}
