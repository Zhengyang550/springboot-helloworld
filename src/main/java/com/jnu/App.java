package com.jnu;

import com.jnu.spring.*;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: zy
 * @Description: 启动代码
 * mybatis启动方式有两种：
 * 1、在mapper层添加@Mapper注解
 * 2、在启动类上加@MapperScan指定扫包范围
 * @Date: 2020-2-2
 */
@MapperScan(basePackages = "com.jnu.mapper")
@EnableAsync
@SpringBootApplication
@Import(value = {BeanTestRegistrar.class})
public class App {
    public static void main(String[] args){
        //整个程序入口 启动Spring Boot项目
        ConfigurableApplicationContext run = SpringApplication.run(App.class,args);
        Test bean = (Test) run.getBean("testFactoryBean");
        bean.hello();
        run.publishEvent(new TestApplicationEvent(new App(),"Test 事件"));
    }
}