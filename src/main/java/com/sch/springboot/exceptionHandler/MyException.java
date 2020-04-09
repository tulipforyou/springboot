package com.sch.springboot.exceptionHandler;
/*
 *  @Author SunChanHui
 *  @Create Time 2020-04-09
 * @PackName com.sch.springboot.exceptionHandler
 * @Project springboot
 */

/**
 * @author sch
 */
public class MyException extends RuntimeException{
    public MyException() {
        super("我的第一個異常");
    }
}
