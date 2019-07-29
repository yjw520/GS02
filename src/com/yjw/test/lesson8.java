package com.yjw.test;

import com.yjw.model.user;
import com.yjw.service.UserService;
import com.yjw.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson8 {
    //注解的使用
    //Web 开发流程 action -> service -> Dao
    @Test
    public void test7(){

//        ApplicationContext context1=new ClassPathXmlApplicationContext("bean6.xml");
//        UserService userService=(UserService)context1.getBean("userService");
//        user user =new user();
//        user.setName("yy");
//        user.setPassword("222");
//        userService.add(user);

        ApplicationContext context2=new ClassPathXmlApplicationContext("bean6.xml");
        UserAction userAction=(UserAction)context2.getBean("userAction");
        user user=new user();
        user.setName("yj");
        user.setPassword("332");
        userAction.save(user);

    }

}
