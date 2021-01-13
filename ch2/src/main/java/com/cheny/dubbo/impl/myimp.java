package com.cheny.dubbo.impl;

import com.cheny.model.domain.User;
import com.cheny.model.service.Userservice;

public class myimp implements Userservice {
    @Override
    public User query(Integer id) {
        User user=new User();
        user.setId(id);
        user.setName("张三");
        return user;
    }

    @Override
    public Integer count() {
        return 52;
    }
}

