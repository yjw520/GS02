package com.yjw.service;

public class UserService implements UserServiceImpl{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void add() {
        System.out.println("创建用户..."+name);
    }
}
