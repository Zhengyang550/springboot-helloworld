package com.jnu.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zy
 * @Description: 用于演示@Async异步调用
 * @Date: 2020-2-4
 */
@Service
@Slf4j
public class HelloService {
    @Autowired
    private SleepService sleepService;

    /**
     * 同步方法
     * @return
     */
    public String syncSayHello() {
        try {
            sleepService.syncSleep();
            return "hello world,这是同步方法";
        } catch (InterruptedException e) {
            log.error(e.getMessage(),e);
            return "error";
        }
    }

    /**
     * 异步方法
     * @return
     */
    public String asyncSayHello() {
        try {
            log.info("主线程 " + Thread.currentThread().getName());
            sleepService.asyncSleep();
            return "hello world,这是异步方法";
        } catch (InterruptedException e) {
            log.error(e.getMessage(),e);
            return "error";
        }
    }
}
