package com.lcwd.core.config;

import com.lcwd.core.couple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//for bean method decalration we can use @configuration annotation and here we can declare in custom configuration class
public class MyConfig {
    @Bean(name = "samosa1")
//	@Primary
    public Samosa getSamosa1(){
        return new Samosa("tandoori samosa1");
    }

    @Bean(name="samosa2")
    public Samosa getSamosa2(){
        return new Samosa("meetha samosa2");
    }
}
