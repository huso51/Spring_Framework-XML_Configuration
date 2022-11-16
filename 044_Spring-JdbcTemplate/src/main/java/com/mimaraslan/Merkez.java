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
		personel.setAdi("Ahmet");
		personel.setSoyadi("Mehmet");
		personel.setTecrube(4);
		
		//Personel personel = new Personel("Mutlu", "Sancaktutar", 12);
	   // personelDao.ekle(personel);
		
		//System.out.println(personelDao.idAra(2));		
		//System.out.println(personelDao.adiAra("Hasan"));		
		//System.out.println(personelDao.soyadiAra("Bozkurt"));		
		//System.out.println(personelDao.tecrubeAra(3));
		
	//	personelDao.createOlusturPersonel(personel);	
		
		//personelDao.readOkuPersonel(3);
		
	//	personelDao.readOkuPersonelTecrube(5);
		
		//  personelDao.updateGuncellePersonel(personel, 7);
		
		personelDao.deleteSilPersonel(5);
		
		context.close();
		
		
	}

}
