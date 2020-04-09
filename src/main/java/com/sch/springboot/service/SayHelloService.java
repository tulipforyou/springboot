package com.sch.springboot.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-01
 * @PackName com.sch.springboot.service
 * @Project springboot
 */

@Service
public class SayHelloService implements SayHello{
    @Override
    public void sayHello(){
        System.out.println("gg");
    }
}
