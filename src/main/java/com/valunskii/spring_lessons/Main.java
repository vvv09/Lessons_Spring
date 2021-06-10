package com.valunskii.spring_lessons;

import com.valunskii.spring_lessons.config.MyConfig;
import com.valunskii.spring_lessons.domain.Animal;
import com.valunskii.spring_lessons.domain.Cat;
import com.valunskii.spring_lessons.domain.Dog;
import com.valunskii.spring_lessons.domain.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        //три разных способа получения бинов
        Cat cat = (Cat) context.getBean("getCat"); //нужно указывать имя, т.к. неоднозначно, поскольку есть бин, возвращающий родительский тип Animals. так же в Animals
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        Animal animal = context.getBean("polymorphism", Animal.class);
        System.out.println("Животное дня - " + animal.getName());
    }
}
