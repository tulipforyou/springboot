package com.sch.springboot.controller;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.controller
 * @Project springboot
 */

import com.sch.springboot.model.User;
import com.sch.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author sch
 */
@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/allUsers")
    public ModelAndView findAllUsers(){
        Collection<User> all = userService.findAll();
        ModelAndView mav=new ModelAndView("allUsers");
        mav.addObject("allUsers",all);
        return mav;
    }
}
