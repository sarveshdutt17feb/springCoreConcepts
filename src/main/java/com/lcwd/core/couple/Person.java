package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Autowired
//    @Qualifier("dog")
    //Field injection
    @Autowired
    Animal animal;
    @Autowired
    Student student;
    @Autowired
            @Qualifier("samosa1")
    Samosa samosa;
    //constructor based injection (for mendatory dependency injection ) use contructor Injection
//    @Autowired
//    public Person(Animal animal,Student student) {
//        System.out.println("calling constructor...autowiring");
//        this.animal = animal;
//        this.student=student;
//
//    }


    public Animal getAnimal() {
        return animal;
    }
    //using Autowired on setter : animal
//    @Autowired
    //for optional dependency injection use setter injection
    public void setAnimal(Animal animal) {
        System.out.println("setting animal");
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }
    //using Autowired on setter : student
//    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting student");
        this.student = student;
    }
//declaring bean using @Bean annotation
    public void playWithAnimal(){
        animal.play();
        student.detail();
        samosa.eat();
    }
}
