package com.jnu.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: zy
 * @Description: 用于演示@Async异步调用
 * @Date: 2020-2-4
 */
@Service
@Slf4j
public class SleepService {
    /**
     * 同步方法
     * @throws InterruptedException
     */
    public void syncSleep() throws InterruptedException {
        log.info("线程名: " +Thread.currentThread().getName());
        log.info("开始同步休眠3秒");
        Thread.sleep(3000);
        log.info("同步休眠结束");
    }

    /**
     * 异步方法
     * @throws InterruptedException
     */
    @Async
    public void asyncSleep() throws InterruptedException {
        log.info("次线程 "+Thread.currentThread().getName());
        log.info("开始异步休眠3秒");
        Thread.sleep(3000);
        log.info("异步休眠休眠结束");
    }
}
