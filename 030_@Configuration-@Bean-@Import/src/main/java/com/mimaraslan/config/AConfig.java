package com.mimaraslan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mimaraslan.A;

@Configuration
public class AConfig {
	
	@Bean (name="beanA")
	public A yaz() {
		return new A();
	}
	
	
//	<bean id="beanA" class="com.mimaraslan.A"/>  

	
}
