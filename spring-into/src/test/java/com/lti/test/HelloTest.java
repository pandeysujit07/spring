package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CurrencyConverter;
import com.lti.component.HelloWorld;

public class HelloTest {
   public static void main(String[] args) {
	
	   
	   //loading spring's Ioc container
	   ApplicationContext context = 
			   new ClassPathXmlApplicationContext("spring-config.xml");
	   
	   //accessing one of the bean
	   HelloWorld hw = (HelloWorld) context.getBean("hw");//bean id
	   System.out.println(hw.sayHello("Sujit"));
	   
	   CurrencyConverter cc = (CurrencyConverter) context.getBean("cc");
	   System.out.println(cc.convertDollarsToRupees(50));
   }
}
