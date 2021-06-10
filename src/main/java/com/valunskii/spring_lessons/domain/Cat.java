package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

public class Cat {
    private String name = "Мурзик";

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
