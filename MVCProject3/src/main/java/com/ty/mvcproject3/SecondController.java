package com.ty.mvcproject3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController 
{
	@RequestMapping("hello1")
	public String hello1()
	{
		return "secondPage";
	}

}
