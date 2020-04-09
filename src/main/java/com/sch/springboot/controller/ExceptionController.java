package com.sch.springboot.controller;

import com.sch.springboot.exceptionHandler.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-09
 * @PackName com.sch.springboot.controller
 * @Project springboot
 */

/**
 * @author sch
 * 自定義異常控制器
 */
@ControllerAdvice
public class ExceptionController {
    /**
     * 處理MyException異常
     * @return 視圖
     * @param e 異常信息
     */
    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String,Object> handlerExceptionOne(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }
}
