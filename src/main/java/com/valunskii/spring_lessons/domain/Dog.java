package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Шарик";

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
