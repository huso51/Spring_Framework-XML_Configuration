package com.mimaraslan.model;

public class Personel {

	private String adi;
	private String soyadi;
	private int tecrube;
	
	public void adiSoyadKontrolEt() {
		System.out.println("---------adiSoyadKontrolEt()-----------");
		if (getAdi().length() < 2 || getSoyadi().length() < 2) {
			throw new NullPointerException();
		}
	}

	public void selamlama(String mesaj, int sayi) {
		System.out.println("---------selamlama(String mesaj)---------");
		System.out.println("GELEN MESAJ: " + mesaj + " SAYI:" +sayi);
	}
	
	
	public void personelBilgiVer() {
		System.out.println("---------personelBilgiVer()------------");
		System.out.println("ADI SOYADI: " + getAdi() + " " + getSoyadi() +  
						 "\nTECRÜBE   : " + getTecrube() + " YIL");
	
	}
	
	
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getTecrube() {
		return tecrube;
	}
	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}

	
	
	
}
