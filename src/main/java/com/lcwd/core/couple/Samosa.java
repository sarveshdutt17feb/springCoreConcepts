package com.lcwd.core.couple;

public class Samosa {
    String samosa;
    public Samosa(String name){
        System.out.println(("this is "+name));
        this.samosa=name;

    }
    public void eat(){
        System.out.println("wow samosa is very spicy");
        System.out.println(this.samosa);
    }
}
