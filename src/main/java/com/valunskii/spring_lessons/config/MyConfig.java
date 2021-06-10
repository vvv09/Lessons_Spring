package com.valunskii.spring_lessons.config;

import com.valunskii.spring_lessons.domain.Cat;
import com.valunskii.spring_lessons.domain.Dog;
import com.valunskii.spring_lessons.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean // аннотачия говорит, что иетод ВЕРНЕТ бин
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean
    public Dog dog() { //Spring называет бины по названию метода
        return new Dog();
    }

    @Bean(name = "parrot-kesha")
    public Parrot parrot() {
        return new Parrot();
    }

}
