package com.jnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author: zy
 * @Description: 使用Freemarker模板引擎渲染web视图
 * @Date: 2020-2-3
 */
@Controller
public class FTLIndexController {
    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        map.put("name","美丽的天使...");
        return "index";
    }
}
