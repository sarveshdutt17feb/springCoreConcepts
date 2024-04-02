package com.lcwd.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //or @Scope(value= configurableBeanFactory.SCOPE_PROTOTYPE)
public class Pepsi {
    public Pepsi(){
        System.out.println("creating pepsi");
    }
    public void drink(){
        System.out.println("pepsi is very cool");
    }
}
