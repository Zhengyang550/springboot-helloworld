package com.jnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zy
 * @Description: Spring Boot2.0第一个案例
 * @Date: 2020-2-2
 */
@RestController
public class MemberController {
    //@RestController注解表示该类中所有方法返回json格式  等价于@Controller+@ReponseBody
    //Spring Boot启动原理：Spring MVC注解方式启动，不需要web.xml文件 默认内置tomcat服务器
    @RequestMapping("/memberIndex")
    public String memberIndex(){
        return "Spring Boot2.0全新版本教程!";
    }
}
