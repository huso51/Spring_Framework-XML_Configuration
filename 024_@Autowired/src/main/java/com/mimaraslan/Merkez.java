package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Merkez {

	
	public static void main(String[] args) {
		
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
	
		/*	
		Ogrenci ogrenci = appCtx.getBean("ogrenciBean", Ogrenci.class);
		
		System.out.println("ADI    :" + ogrenci.getAdi());
		System.out.println("SOYADI :" + ogrenci.getSoyadi());
		System.out.println("YAŞI   :" + ogrenci.getYasi());
		*/
		
		
		Ders ders = appCtx.getBean("dersBean", Ders.class);
		System.out.println("ADI     :" + ders.getOgrenci().getAdi());
		System.out.println("SOYADI  :" + ders.getOgrenci().getSoyadi());
		System.out.println("YAŞI    :" + ders.getOgrenci().getYasi());
		System.out.println("DERS    :" + ders.getDers());
		System.out.println("NOT     :" + ders.getPuan());
		
		
	}

}
