package com.weblearner.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeSecurityController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	


}
