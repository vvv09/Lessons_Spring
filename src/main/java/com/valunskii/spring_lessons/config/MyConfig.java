package com.valunskii.spring_lessons.config;

import com.valunskii.spring_lessons.domain.Animal;
import com.valunskii.spring_lessons.domain.Cat;
import com.valunskii.spring_lessons.domain.Dog;
import com.valunskii.spring_lessons.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("com.valunskii.spring_lessons.domain")
public class MyConfig {

    @Bean // аннотачия говорит, что иетод ВЕРНЕТ бин
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean(name = "polymorphism")
    public Animal getAnimal() { //таким образом можно писать абсолютно любую логику! гибкость!
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Dog();
            case WEDNESDAY: return new Parrot();
            default: return new Cat();
        }
    }

}
