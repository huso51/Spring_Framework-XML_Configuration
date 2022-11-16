package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.matematik.HesapMakinesi;

public class Merkez {

	
	public static void main(String[] args) {
		
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

	 //   AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
	 //   appCtx.register(SpringBeanConfig.class);
	    
		HesapMakinesi hesapMakinesi = appCtx.getBean("hesapMakinesiBeanComponent", HesapMakinesi.class);
		hesapMakinesi.sonuclariGetirYaz(15, 3);
	  

	}

}
