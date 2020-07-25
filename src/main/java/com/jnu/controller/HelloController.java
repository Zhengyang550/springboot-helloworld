package com.jnu.controller;

import com.jnu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * @Author: zy
 * @Description: 用于演示@Async异步调用
 * @Date: 2020-2-4
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    //初始化的时候加载
    @Value("${name}")
    private String name;

    @RequestMapping("/getName")
    public String getName(){
        return name;
    }

    /**
     * 同步方法
     * @return
     */
    @RequestMapping("/sync")
    public String getSyncHello(){

        long n = Instant.now().toEpochMilli();
        //异步
        String s = helloService.syncSayHello();

        long f = Instant.now().toEpochMilli();
        return s + " 时间: " + (f-n);
    }

    /**
     * 异步方法
     * @return
     */
    @RequestMapping("/async")
    public String getAsyncHello(){
        long n = Instant.now().toEpochMilli();
        //异步
        String s = helloService.asyncSayHello();

        long f = Instant.now().toEpochMilli();
        return s + "时间:" + (f-n);
    }

}
