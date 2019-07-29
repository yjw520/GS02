package com.yjw.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class user implements BeanNameAware , BeanFactoryAware, InitializingBean , DisposableBean {
    private String name;
    private String password;

    public void setName(String name) {
        System.out.println("2.赋值属性:"+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public user()
    {
        System.out.println("1.实例化......");
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3.设置Bean的名字："+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //把对象放进工厂，即放进容器
        System.out.println("4.Bean 工厂："+beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.属性赋值完成...");
    }
    public void myInit()
    {
        System.out.println("7.自定义初始化方法...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9.销毁Bean...");
    }
    public void myDestroy()
    {
        System.out.println("10.自定义的销毁方法...");
    }
}
