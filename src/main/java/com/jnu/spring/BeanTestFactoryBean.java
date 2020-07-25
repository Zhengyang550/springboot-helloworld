package com.jnu.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanTestFactoryBean implements FactoryBean<BeanTest> {
    @Override
    public BeanTest getObject()  {
        log.info("Before new object...");
        // 这里可以灵活的创建 Bean，如：代理、修饰
        return new BeanTest();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
