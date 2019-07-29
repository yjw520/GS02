package com.yjw.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yjw.model.user;
public class lesson03 {
    //Bean 的生命周期
    @Test
    public void test2() throws Exception{
        ApplicationContext context1 = new ClassPathXmlApplicationContext("bean1.xml");
        user User1 = (user) context1.getBean("user");
        System.out.println(User1);

        //关闭容器
        context1.getClass().getMethod("close").invoke(context1);
    }
}
