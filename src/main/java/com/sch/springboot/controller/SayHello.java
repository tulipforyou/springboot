package com.sch.springboot.controller;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-03-31
 * @PackName com.sch.springboot.controller
 * @Project springboot
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sch
 * @RestController === @Controller+@ResponseBody
 */
@RestController
public class SayHello {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        return "Hello SpringBoot By Quickly Start!";
    }
}
