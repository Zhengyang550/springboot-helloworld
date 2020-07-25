package com.jnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zy
 * @Description: 全局捕获异常
 * @Date: 2012-2-3
 */
@RestController
public class ErrorController {
    @RequestMapping("/getUser")
    public String getUser(@RequestParam int i){
        int j = 1/i;
        return "success" + j;
    }
}

