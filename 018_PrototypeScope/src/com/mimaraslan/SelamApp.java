package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
						
		Selam selamNesnesi1 =  context.getBean("selam", Selam.class);	
		selamNesnesi1.setMesaj("Mutlu Sancaktutar");		
		selamNesnesi1.goster();
		
		Selam selamNesnesi2 =  context.getBean("selam", Selam.class);	
		selamNesnesi2.setMesaj("Burak Yılmaz");
		selamNesnesi2.goster();
		
		selamNesnesi1.goster();
		
		Selam selamNesnesi3 = new Selam();
		selamNesnesi3.goster();
	
		System.out.println(context.getBean("selam", Selam.class));	
		System.out.println(context.getBean("selam", Selam.class));	
		System.out.println(context.getBean("selam", Selam.class));	
		System.out.println(context.getBean("selam", Selam.class));	
		System.out.println(context.getBean("selam", Selam.class));	
		
	
	}
	
	
/*	com.mimaraslan.Selam@cb5822
	com.mimaraslan.Selam@4b9e13df
	com.mimaraslan.Selam@2b98378d
	com.mimaraslan.Selam@475530b9
	com.mimaraslan.Selam@1d057a39*/	


}
