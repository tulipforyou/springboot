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
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Map;

/**
 * @author sch
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/allUsers")
    public ModelAndView findAllUsers(){
        Collection<User> all = userService.findAll();
        ModelAndView mav=new ModelAndView("user/allUsers");
        mav.addObject("allUsers",all);
        return mav;
    }

    @PostMapping(path = "/login")
    //@RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName, @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(userName) && "123456".equals(password)){
            session.setAttribute("loginUser",userName);
            return "redirect:/user/allUsers";
        }else{
            map.put("msg","用戶名或密碼錯誤");
            return "login";
        }
    }
}
