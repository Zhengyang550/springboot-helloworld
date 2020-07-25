package com.jnu.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zy
 * @Description: 全局捕获异常：使用AOP技术，采用异常通知
 * 1、捕获返回json格式
 * 2、捕获返回页面
 * @Date: 2020-2-3
 */
@ControllerAdvice(basePackages = "com.goldwind")
public class GlobalExceptionHandler {

    //private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //@ResponseBody：返回json格式
    //ModelAndView：返回视图页面
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        //实际开发中 将错误记录在日志中
        Map<String,Object> errorResultMap = new HashMap<>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("errorMsg","系统错误");

        //打印错误消息
        //logger.error("服务器内部错误");

        return errorResultMap;
    }
}
