package com.yjw.test;

import com.yjw.model.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson04 {
    @Test
    public void  test3(){
        ApplicationContext context1=new ClassPathXmlApplicationContext("bean2.xml");
        student stu= (student) context1.getBean("stu");
        System.out.println(stu);

    }
}
