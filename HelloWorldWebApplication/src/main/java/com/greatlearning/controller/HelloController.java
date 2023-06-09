package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //one of the stereotype annotations of @Component (others are @Service and @Repository)
public class HelloController {
	
	//add request mapping (url associated with this method)
		@RequestMapping("/")
		public String getWelcomeMessage() {
			return "welcome";
		}
	
	//add request mapping (url associated with this method)
	@RequestMapping("/hello")
	public String getHelloMessage() {
		return "hello";
	}
	
	//add request mapping (url associated with this method)
		@RequestMapping("/goodbye")
		public String getGoodByeMessage() {
			return "goodbye";
		}

}
