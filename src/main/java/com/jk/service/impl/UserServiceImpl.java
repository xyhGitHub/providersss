package com.jk.service.impl;

import com.jk.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name, String age) {
        System.out.println("姓名"+name+",age"+age);
    }

    @Override
    public String returnStr(String name, String hobby) {
        return "姓名"+name+",hobby"+hobby;
    }
}
