package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
   public void play(){
       System.out.println("Dog is playing");
   }
}
