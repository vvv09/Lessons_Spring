package com.valunskii.spring_lessons.domain;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min=2, max=8)
    private int repeat;

    private String message;

    @Override
    public void sayQuote() {
            System.out.println("message = " + message + " - repeated " + repeat + " times.");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1: Spring через Reflection вызвал конструктор класса для создания бина");
    }

    public void init() {
        System.out.println("Phase 2: repeat is " + repeat);
    }
}
