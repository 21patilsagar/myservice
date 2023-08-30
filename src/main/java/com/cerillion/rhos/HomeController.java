package com.cerillion.rhos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index1")
	public String index() {		
		return "index.jsp";
	}
	
	@RequestMapping("/")
	public String home() {		
		return "home.jsp";
	}
	
}
