package com.cheny.impl;
import com.cheny.domain.User;
import com.cheny.service.myservice;

public class myimpl implements  myservice{
    @Override
    public User query(Integer id) {
        User user=new User();
        user.setId(id);
        user.setName("zhangsan");
        return user;
    }

    @Override
    public Integer count() {
        return 52;
    }
}
