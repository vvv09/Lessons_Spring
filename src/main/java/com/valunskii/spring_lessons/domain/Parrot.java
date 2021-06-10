package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

public class Parrot implements Animal {
    private String name = "Кеша";

    public Parrot() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
