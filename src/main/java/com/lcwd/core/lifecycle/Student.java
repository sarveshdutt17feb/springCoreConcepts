package com.lcwd.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
    public Student(){
        System.out.println("#creating student1");
    }
    @PostConstruct
    public void created(){
    //some initialization
        System.out.println("#student bean is created()");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("#bye bye student bean : destroy()");
    }
}
