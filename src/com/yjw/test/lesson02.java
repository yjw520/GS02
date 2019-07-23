package com.yjw.test;

import com.yjw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson02 {

    @Test
    public void test1() {
        //以前用UserService的方式，自己创建对象
        //UserService UserServic=new UserService();
        //UserServic.add();

        //现在用的方式，从spring容器获取
        //1.加载beans.xml  这个spring的配置文件,内部就会创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //2.从spring容器获得UserService对象

        UserService userservice1=(UserService) context.getBean("userService");
        userservice1.add();

        UserService userservice2=(UserService) context.getBean("userService");
        userservice2.add();

        System.out.println(userservice1);
        System.out.println(userservice2);

    }
}
