package com.cheny.controller;

import com.cheny.model.domain.User;
import com.cheny.model.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class mycontroller {

    @Autowired
    @Qualifier(value = "userser")
    private Userservice userservice;

    @RequestMapping(value = "/find")
    public ModelAndView doSome(Integer id){
        ModelAndView modelAndView=new ModelAndView();
        System.out.println(id);
        System.out.println(userservice.getClass().getName());
        System.out.println(userservice.getClass().toString());
        User user=userservice.query(id);
        Integer num=userservice.count();
        modelAndView.addObject("user1",user);
        modelAndView.addObject("count1",num);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
