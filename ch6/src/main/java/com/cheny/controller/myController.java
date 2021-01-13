package com.cheny.controller;

import com.cheny.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cheny.service.myservice;

@Controller
public class myController {
    @Autowired
    @Qualifier(value = "service1")
    private myservice myservice1;
    @Autowired
    @Qualifier(value = "service2")
    private myservice myservice2;

    @RequestMapping(value = "/find")
    public ModelAndView doSome(Integer id){
        ModelAndView mv=new ModelAndView();
        User user=myservice1.query(id);
        Integer num=myservice1.count();
        mv.addObject("user1",user);
        mv.addObject("count1",num);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping(value = "/find2")
    public ModelAndView doSome2(Integer id){
        ModelAndView mv=new ModelAndView();
        User user=myservice2.query(id);
        Integer num=myservice2.count();
        mv.addObject("user1",user);
        mv.addObject("count1",num);
        mv.setViewName("result");
        return mv;
    }
}
