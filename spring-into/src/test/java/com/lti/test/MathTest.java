package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Calculator;
import com.lti.component.HelloAgain;

public class MathTest {
  public static void main(String[] args) {
	
	  ApplicationContext context = 
			   new ClassPathXmlApplicationContext("spring-config.xml");
	  
	  Calculator cal = (Calculator) context.getBean("a");
	  System.out.println(cal.add(5, 9));
	  System.out.println(cal.sub(8, 5));
	  
	  HelloAgain h = (HelloAgain) context.getBean("hi");
	  System.out.println(h.sayHi("pavan"));
}
}
