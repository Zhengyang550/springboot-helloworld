package com.jnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zy
 * @Description:
 * @Date: 2020-2-2
 */
@RestController
public class OrderController {
    @RequestMapping("/orderIndex")
    public  String orderIndex(){
        return "orderIndex";
    }
}
