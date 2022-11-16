package com.mimaraslan.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.model.Personel;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel1 = appCtx.getBean("beanPersonelProxy", Personel.class);	
		
		try {
			personel1.adiSoyadKontrolEt();
			personel1.selamlama(" SELAM ");
			personel1.personelBilgiVer();
		} catch (Exception e) {
			System.out.println("ISTISNA : " +e);
		}
		
		
		
		
		appCtx.close();
		
		
	}

}
