package com.sch.springboot.model;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-03-31
 * @PackName com.sch.springboot.model
 * @Project springboot
 */

/**
 * @author sch
 */
public class Dog {
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
