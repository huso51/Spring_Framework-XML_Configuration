package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.dao.PersonelDao;
import com.mimaraslan.model.Personel;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDao personelDao = context.getBean("personelDaoBean",PersonelDao.class);
		
		Personel personel = new Personel();
		
		//Personel personel = new Personel("Mutlu", "Sancaktutar", 12);
	   // personelDao.ekle(personel);
		

		//System.out.println(personelDao.idAra(2));
		
		//System.out.println(personelDao.adiAra("Hasan"));
		
		//System.out.println(personelDao.soyadiAra("Bozkurt"));
		
		System.out.println(personelDao.tecrubeAra(3));
		
		context.close();
		
		
	}

}
