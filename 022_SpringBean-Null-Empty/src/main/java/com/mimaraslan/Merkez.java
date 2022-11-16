package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		B bNesnesi =  context.getBean("beanB", B.class);		
		
		bNesnesi.sonucuGoster();
		
	}

}
