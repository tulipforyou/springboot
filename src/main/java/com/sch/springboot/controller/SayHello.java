package com.sch.springboot.controller;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-03-31
 * @PackName com.sch.springboot.controller
 * @Project springboot
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sch
 * @RestController === @Controller+@ResponseBody
 */
@Controller
public class SayHello {
    @ResponseBody
    @RequestMapping(path = "/hello")
    public String sayHello(){
        return "Hello SpringBoot By Quickly Start!";
    }

    @RequestMapping(path = "/thymeleaf")
    public ModelAndView thymeleafStudy(){
        ModelAndView mav=new ModelAndView("thymeleaf");
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(1);
        list.add(2);
        mav.addObject("list",list);
        return mav;
    }
}
