package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

public class Cat implements Animal{
    private String name = "Мурзик";

    public Cat() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
