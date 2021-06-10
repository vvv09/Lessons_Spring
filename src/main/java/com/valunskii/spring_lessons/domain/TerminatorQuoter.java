package com.valunskii.spring_lessons.domain;

public class TerminatorQuoter implements Quoter {

    private String message;

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
