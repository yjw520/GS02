package com.yjw.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class MyBeanPostProcessor implements BeanPostProcessor {

    private Object Bean;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //这边可用于多个对象共同的十五处理
        System.out.println("5.预处理："+bean+":"+beanName);
    return Bean;
}
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("8.后处理："+bean+":"+beanName);
        return null;
    }


}
