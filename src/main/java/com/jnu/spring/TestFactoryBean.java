package com.jnu.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<Test> {
    @Override
    public Test getObject() throws Exception {

        // 这里可以灵活的创建 Bean，如：代理、修饰

        return new Test();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}