package com.mimaraslan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		
		//Araba  araba = new Araba(); 
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.hareketeGec();
		
		Kamyon kamyon = (Kamyon) beanFactory.getBean("kamyon");
		kamyon.hareketeGec();

	}

}
