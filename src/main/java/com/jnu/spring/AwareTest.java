package com.jnu.spring;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Data
@Slf4j
public class AwareTest implements ApplicationContextAware, BeanPostProcessor, BeanFactoryPostProcessor {
    /*
     * 保存应用上下文
     */
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        log.info("------------------------------------------setApplicationContext-------------------------");
        this.applicationContext = applicationContext;
        //输出所有BeanDefinition name
        for(String name:applicationContext.getBeanDefinitionNames()) {
            log.info(name);
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)  {
        if(beanName.equals("beanTest")) {
        log.info("postProcessBeforeInitialization:" + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)  {
        if(beanName.equals("beanTest")) {
            log.info("postProcessAfterInitialization:" + beanName);
        }
        return bean;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory){
        log.info("------------------------------------------postProcessBeanFactory-------------------------");
        String beanNames[] = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            log.info(beanDefinition.toString());
        }
    }
}
