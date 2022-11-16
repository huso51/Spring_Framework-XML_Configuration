package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Cizim {

	
	public static void main(String[] args) {
		
		// Resource resource = new FileSystemResource("spring.xml");
		// XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		 
		// ClassPathResource classPathResource = new ClassPathResource("spring.xml");
		// BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		 
		// ApplicationContext context = new ClassPathXmlApplicationContext( new String [] { "spring.xml"});
		// BeanFactory beanFactory = context;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		 Ucgen ucgen =   (Ucgen) context.getBean("ucgen");   //new Ucgen();
		 ucgen.ciz();
 

	}

}
