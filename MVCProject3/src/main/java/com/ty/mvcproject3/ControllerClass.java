package com.ty.mvcproject3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass
{
	@RequestMapping("hello")
	public String hello()
	{
		return "firstPage";
	}

}
