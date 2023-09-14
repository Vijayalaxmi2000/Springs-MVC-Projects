package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@RequestMapping("hello") //used to request the particular mapping
	public ModelAndView hello()
	{
		ModelAndView view = new ModelAndView("hello Page");
		view.addObject("hi","Second mvc application");
		return view;
	}
	@RequestMapping("hello1")
	public ModelAndView hello1()
	{
		ModelAndView view1 = new ModelAndView("secondpage");
		return view1;
	}

}
