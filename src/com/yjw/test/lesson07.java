package com.yjw.test;

import com.yjw.service.UserService;
import com.yjw.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yjw.model.user;


public class lesson07 {
    @Test
    public void  test6() {
        //注解取代xml中的配置
        ApplicationContext context1=new ClassPathXmlApplicationContext("bean5.xml");

        //配置了了id，@Component("userService"),就可以通过id获取
        //UserService userService=(UserService)context1.getBean("userService");


        //没有在@Component中配置id,就用类型获取
        //这个类型可以是接口，也可以是实现类
        //UserService userService=(UserService)context1.getBean(UserService.class);
        UserService userService=(UserService)context1.getBean(UserServiceImpl.class);

        user user=new user();
        user.setName("yjw");
        userService.add(user);
    }
}


