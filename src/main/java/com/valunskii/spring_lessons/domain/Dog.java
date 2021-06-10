package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

public class Dog implements Animal{
    private String name = "Шарик";

    public Dog() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
