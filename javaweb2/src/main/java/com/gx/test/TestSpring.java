package com.gx.test;

import com.gx.domain.Account;
import com.gx.domain.ke;
import com.gx.service.AccountService;
import com.gx.service.keService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
    @Test
    public void run2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        keService as = (keService) ac.getBean("keService");
        as.findAll();
    }
}

