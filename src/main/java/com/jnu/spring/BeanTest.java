package com.jnu.spring;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@Slf4j
public class BeanTest implements InitializingBean, DisposableBean, BeanNameAware {
    /*
     * 保存当前bean name
     */
    private String beanName;

    /*
     * 构造函数
     */
    public BeanTest(){
        log.info("New object...");
    }

    @Override
    public void destroy()  {
        log.info("Destroying ...");
    }

    @Override
    public void afterPropertiesSet() {
        log.info("Initializing ....");
    }


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        log.info("Current bean name:" + name);
    }
}