package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-02
 * @PackName com.sch.springboot.controller
 * @Project springboot
 */

/**
 * @author sch
 */
@Controller
public class HtmlToHtml {
    @RequestMapping(path = "success")
    public String success(){
        return "success";
    }
    @RequestMapping(path = "login")
    public String login(){
        return "login";
    }
}
