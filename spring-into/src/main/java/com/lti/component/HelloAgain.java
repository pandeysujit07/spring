package com.lti.component;

import org.springframework.stereotype.Component;

@Component("hi")
public class HelloAgain {
  
	public String sayHi(String name) {
		return "hi " + name;
	}
	
}
