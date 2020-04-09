package com.sch.springboot.config;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-03
 * @PackName com.sch.springboot.config
 * @Project springboot
 */

import com.sch.springboot.utils.handlerInterceptor.LoginHandlerInterceptor;
import com.sch.springboot.utils.resolveLocale.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    /**
     * 配置攔截器
     * @param registry 參數
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/")
                .excludePathPatterns("/login")
                .excludePathPatterns("/webjars/**");
    }

    /**
     * 使用自定義區域解析器
     */
    //@Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
