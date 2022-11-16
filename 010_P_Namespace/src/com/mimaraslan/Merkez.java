package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		System.out.println("ADI          : "+ ogrenci.getAdi());
		System.out.println("SOYADI       : "+ ogrenci.getSoyadi());
		System.out.println("NUMARASI     : "+ ogrenci.getNumarasi());
		System.out.println("ÜNİVERSİTESİ : "+ ogrenci.getUniversitesi().getKurumAdi());

	}

}
