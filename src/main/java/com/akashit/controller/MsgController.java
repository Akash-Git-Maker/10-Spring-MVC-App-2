package com.akashit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Hi, welcome to Ashok IT....");
        mav.setViewName("message");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Good Evening.. !");
        mav.setViewName("message");
        return mav;
    }
}
