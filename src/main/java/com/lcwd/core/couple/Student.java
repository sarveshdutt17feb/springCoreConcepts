package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("creating student");
    }

    public void detail(){
        System.out.println("I am a student detail");
    }
}
