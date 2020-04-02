package com.sch.springboot;

import com.sch.springboot.model.Person;
import com.sch.springboot.service.SayHelloService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    Person person;
    @Autowired
    SayHelloService sayHelloService;
    Logger logger= LoggerFactory.getLogger(SpringbootApplicationTests.class);



    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void test(){
       // System.out.println(ioc.containsBean("sayHelloService"));
        logger.trace("***************trace***************");
        logger.info("================logger==============");
        logger.error("---------------error---------------");
        sayHelloService.sayHello();
    }

}
