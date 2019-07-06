package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cc")//alternative to <bean id=".." class=".."> + cc is bean id +we are writing pojo classes
public class CurrencyConverter {
	 
	public double convertDollarsToRupees(double dollars) {
		return dollars *68.44;
	}
}
