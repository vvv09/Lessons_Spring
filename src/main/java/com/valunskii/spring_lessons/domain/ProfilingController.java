package com.valunskii.spring_lessons.domain;

public class ProfilingController implements ProfilingControllerMBean {

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
