package com.mimaraslan.dao;

import com.mimaraslan.model.Personel;

public interface PersonelDao {
	
	public void ekle(Personel personel);
	
	public Personel idAra(int id);
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeAra(int tecrube);
	
	
	// public Personel personelAra(int id, String adi, String soyadi,  int tecrube);
	
}
