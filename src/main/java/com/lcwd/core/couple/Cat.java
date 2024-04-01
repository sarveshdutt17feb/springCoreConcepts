package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    public void play(){
        System.out.println("cat is playing");
    }
}
