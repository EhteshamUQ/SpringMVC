package com.controllers.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request , HttpServletResponse response ){
        ModelAndView modelAndView = new ModelAndView();
        int t1 = Integer.parseInt(request.getParameter("t1"));
        int t2 = Integer.parseInt(request.getParameter("t2"));
        int sum = t1+t2;
        modelAndView.addObject("sum" , sum);
        modelAndView.setViewName("display");
        return modelAndView;
    }
}
