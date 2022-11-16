package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Merkez {

	
	public static void main(String[] args) {
		
		
	//	ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		
	    AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
	    appCtx.register(SpringBeanConfig.class);
	    
	    appCtx.refresh();
	    
	    Ogrenci ogrenci = appCtx.getBean(Ogrenci.class);
	    System.out.println(ogrenci.getSehir().getSehirAdi());
	    System.out.println(ogrenci.getSehir().getPlakaNo());
	    
	    
	   ((ConfigurableApplicationContext) appCtx).close();

	}

}
