package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		// TİP DÖNÜŞÜMÜ
		//Calisan calisan = (Calisan) context.getBean("beanCalisan");

		// PARAMETREDE SINIF ADI
		Calisan calisan =  context.getBean("beanCalisan", Calisan.class);

		// DOĞRUDAN SINIF ADI
		//Calisan calisan = context.getBean(Calisan.class);
		

		System.out.println("ADI     : " + calisan.getAdi());
		System.out.println("SOYADI  : " + calisan.getSoyadi());
		System.out.println("YAŞI    : " + calisan.getYasi());
		System.out.println("MAHALLE : " + calisan.getAdres().getMahalle());
		System.out.println("SEMT    : " + calisan.getAdres().getSemt());
		System.out.println("ŞEHİR   : " + calisan.getAdres().getSehir());
	
		
	}

}
