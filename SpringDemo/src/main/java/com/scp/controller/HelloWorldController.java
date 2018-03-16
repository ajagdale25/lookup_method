package com.scp.controller;
//com.scp.controller: so this controller we have to register inside the 
//dispatcher.servlet.xml with the help of <context:component-scan base-package="com.scp.controller">
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("welcomePage", "welcomeMessage", "welcome to Spring mvc wolrld");
		//welcomePage is nothing but your jsp page.
		//inside the welcomePage.jsp page it will search welcomMessage to access this msg.
	}

}
