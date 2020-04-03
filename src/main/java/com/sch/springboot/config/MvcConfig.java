package com.sch.springboot.config;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.config
 * @Project springboot
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sch
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     * 發送su請求時轉到success頁面
     * @param registry 參數
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/su").setViewName("success");
    }

}
