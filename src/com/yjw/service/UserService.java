package com.yjw.service;

import com.yjw.Dao.UserDao;
import com.yjw.model.user;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserService implements UserServiceImpl{

    private String name;
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void add(user user){
        System.out.println("Service 添加用户："+user);
        userDao.add(user);
    }
    public void add() {
        System.out.println("创建用户..."+name);
    }

}
