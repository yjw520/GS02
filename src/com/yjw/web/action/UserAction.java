package com.yjw.web.action;

import com.yjw.model.user;
import com.yjw.service.UserService;

public class UserAction {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(user user){
        System.out.println("Action save()方法");
    }
}
