package com.examples.S06SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S06SpringMVCDemo.model.User;

@Controller
public class UserController {
    @RequestMapping("/register")
	public ModelAndView showRegistrationPage() {
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("registeruser");
		return mv;
	}
    @RequestMapping(value="/signupuser",method=RequestMethod.POST)
   	public ModelAndView SignupUser(@ModelAttribute("user") User user) {
    	System.out.println("From UI. Retreived object from spring container:"+user);
       	ModelAndView mv=new ModelAndView();
       	mv.addObject("user",user);
   		mv.setViewName("registeruserresult");
   		return mv;
   	}
}
















