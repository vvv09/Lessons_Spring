package com.valunskii.spring_lessons.domain;

@DeprecatedClass(newImpl = T1000.class)
@Profiling
public class TerminatorQuoter implements Quoter {


    @InjectRandomInt(min=2, max=8)
    private int repeat;

    private String message;

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3: Вызов метода через ApplicationListener по событию Refresh context");
        System.out.println("message = " + message + " - repeated " + repeat + " times.");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /* Нет постпроцессоров, некому обрабатывать аннотацию @InjectRandomInt */
    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
    /* ------------------------------------------------------------------- */

    public TerminatorQuoter() {
        System.out.println("Phase 1: Spring через Reflection вызвал конструктор класса для создания бина");
    }

    public void init() {
        System.out.println("Phase 2: repeat is " + repeat);
    }
}
