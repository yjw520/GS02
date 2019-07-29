package com.yjw.test;

import com.yjw.model.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class lesson5 {
    @Test
    public void test4(){
        ApplicationContext context1=new ClassPathXmlApplicationContext("bean3.xml");
        Customer customer=(Customer) context1.getBean("customer");
        System.out.println(customer);

        System.out.println(customer.getAddress());
    }
}
