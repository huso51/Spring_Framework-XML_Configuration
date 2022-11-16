package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		//ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		
		appCtx.start(); // Ayağa kaldırılıyor.
		
		Sozler sozler = appCtx.getBean("sozlerBean", Sozler.class);
		sozler.ekranaYaz();
		
		appCtx.refresh();
		
		
		appCtx.stop();
		appCtx.close();
	}

}
