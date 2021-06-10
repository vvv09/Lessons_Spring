package com.valunskii.spring_lessons.domain;

import org.springframework.stereotype.Component;

@Component("parrot-kesha")
public class Parrot {
    private String name = "Кеша";

    public Parrot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
