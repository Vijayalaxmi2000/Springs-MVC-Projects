package com.ty.mvcproject4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController 
{
	@RequestMapping("hello")
	public String hello()
	{
		return "firstPage";
	}

}
