package com.jnu.spring;

import org.springframework.context.ApplicationEvent;

public class TestApplicationEvent extends ApplicationEvent {
    private String name;

    public TestApplicationEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
