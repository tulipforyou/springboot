package com.sch.springboot.model;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-03-31
 * @PackName com.sch.springboot.model
 * @Project springboot
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @author sch
 */

/**
 * 將yml文件中配置的值映射到這個組件中
 * @ConfigurationProperties: 告訴SpringBoot將本耒中所有屬性和配置文件中相關配置關聯
 *                           prefix:指定配置文件中的位置
 * @Validated: 用於數據校驗
 */
@PropertySource(value = {"classpath:static/props/person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
    //@Email
    private String lastName;
    private Integer age;
    private Date date;
    private Map<String,Object> map;
    private List<String> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
