package com.sch.springboot.service;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.service
 * @Project springboot
 */

import com.sch.springboot.dao.UserDao;
import com.sch.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * @author sch
 */
public class UserService {
    @Autowired
    private UserDao userDao;



    public Collection<User> findAll(){
        return userDao.findAll();
    }
    public User findById(Integer id){
        return userDao.findById(id);
    }
}
