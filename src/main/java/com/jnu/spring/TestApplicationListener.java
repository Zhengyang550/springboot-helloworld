package com.jnu.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        //TestApplicationEvent事件发生 执行
        if (event instanceof TestApplicationEvent) {
            TestApplicationEvent testApplicationEvent = (TestApplicationEvent) event;
            log.info(testApplicationEvent.getName());
        }
    }
}
