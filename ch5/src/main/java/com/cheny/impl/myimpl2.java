package com.cheny.impl;
import com.cheny.domain.User;
import com.cheny.service.myservice;

public class myimpl2 implements myservice{
    @Override
    public User query(Integer id) {
        User user=new User();
        user.setId(id+11);
        user.setName("lisi");
        return user;
    }

    @Override
    public Integer count() {
        return 520;
    }
}
