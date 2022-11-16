package com.mimaraslan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("SELAM Başlatmadan öncesi :" + beanAdi);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("SELAM Başlatmadan sonrası :" + beanAdi);
		return bean;
	}



}
