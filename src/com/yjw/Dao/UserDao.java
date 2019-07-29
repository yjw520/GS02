package com.yjw.Dao;

import com.yjw.model.user;

public class UserDao implements UserDaoImpl{


    @Override
    public void add(user user) {
        System.out.println("Dao  添加用户："+user);
    }
}
