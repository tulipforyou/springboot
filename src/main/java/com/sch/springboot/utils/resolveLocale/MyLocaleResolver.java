package com.sch.springboot.utils.resolveLocale;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-06
 * @PackName com.sch.springboot.utils.resolveLocale
 * @Project springboot
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author sch
 */
public class MyLocaleResolver implements LocaleResolver {
    Logger logger= LoggerFactory.getLogger(MyLocaleResolver.class);


    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //請求中是否帶有區域信息
        String l=request.getParameter("l");
        Locale locale=Locale.getDefault();
        logger.debug("*****************------>"+l);
        if(StringUtils.isEmpty(l)){
            //以此分隔符分割區域信息
            String[] s = l.split("_");
            //創建區域對象
            locale=new Locale(s[0],s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
