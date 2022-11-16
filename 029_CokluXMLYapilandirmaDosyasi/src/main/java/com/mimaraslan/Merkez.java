package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.musteri.Musteri;

public class Merkez {

	
	public static void main(String[] args) {
		
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		Musteri musteri = appCtx.getBean("BeanMusteri", Musteri.class);
		
		System.out.println("ADI    : "+ musteri.getAdi());
		System.out.println("SOYADI : "+ musteri.getSoyadi());
		System.out.println("TELEFON: "+ musteri.getTelNo());	
		System.out.println("ADRESİ : "+ musteri.getAdres().getAdres());
	}

}
