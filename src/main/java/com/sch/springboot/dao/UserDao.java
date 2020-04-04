package com.sch.springboot.dao;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.dao
 * @Project springboot
 */

import com.sch.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sch
 */
@Repository
public class UserDao {
    private static Map<Integer, User> map=null;
    static {
        map=new HashMap<>();
        map.put(101,new User(1,"sch",22,"男"));
        map.put(102,new User(2,"孫朝輝",22,"男"));
        map.put(103,new User(3,"wbq",22,"女"));
        map.put(104,new User(4,"王冰琦",22,"女"));
        map.put(105,new User(5,"lq",10,"男"));
        map.put(106,new User(6,"ls",7,"男"));
    }
    /**
     * 通過id獲取
     */
    public User findById(Integer id){
        return map.get(id);
    }
    //獲取所有
    public Collection<User> findAll(){
        return map.values();
    }
}
