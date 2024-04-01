package com.lcwd.core.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {
   public void play(){
       System.out.println("Dog is playing");
   }
}
