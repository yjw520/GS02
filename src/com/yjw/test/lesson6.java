package com.yjw.test;

import com.yjw.model.Programmer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson6 {
    @Test
    public void test5(){
        ApplicationContext context1=new ClassPathXmlApplicationContext("bean4.xml");
        Programmer programmer=(Programmer)context1.getBean("programmer");
        System.out.println("车："+programmer.getCar());
        System.out.println("宠物："+programmer.getPat());
        System.out.println("个人信息："+programmer.getInfo());
        System.out.println("数据可以连接信息："+programmer.getMysqlinfo());
        System.out.print("水果:");
        for(String fruit:programmer.getFruit())
        {
            System.out.print(fruit+" ");
        }

    }
}
