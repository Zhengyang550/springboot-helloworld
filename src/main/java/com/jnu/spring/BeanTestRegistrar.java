package com.jnu.spring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class BeanTestRegistrar implements ImportBeanDefinitionRegistrar {
    /*
     *  一般通过 AnnotationMetadata 进行业务判断，然后通过 BeanDefinitionRegistry 直接注册 Bean
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanTest.class);
        registry.registerBeanDefinition(BeanTest.class.getName(), beanDefinition);
    }
}
