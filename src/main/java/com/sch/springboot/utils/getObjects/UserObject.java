package com.sch.springboot.utils.getObjects;

import com.sch.springboot.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.utils.getObjects
 * @Project springboot
 */

/**
 * @author sch
 */
@Configuration
public class UserObject {
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
