package com.ty.mvcproject4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController 
{
	@RequestMapping("/firstPage")
	public String hi()
	{
		return "secondPage";
	}
	@RequestMapping("/process")
	public String hello()
	{
		return "thirdPage";
	}

}
