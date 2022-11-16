package com.mimaraslan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Cizim {

	
	public static void main(String[] args) {
		
		// Resource resource = new FileSystemResource("spring.xml");
		// XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		 
		 //ClassPathResource classPathResource = new ClassPathResource("spring.xml");
		 //BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		 
		ApplicationContext context = new ClassPathXmlApplicationContext( new String [] { "spring.xml"});
		BeanFactory beanFactory = context;
		
		 Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		 ucgen.ciz();
		 
		 

	}

}
