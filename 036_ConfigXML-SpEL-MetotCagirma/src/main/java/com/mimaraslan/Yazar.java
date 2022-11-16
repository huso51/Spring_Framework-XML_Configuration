package com.mimaraslan;

public class Yazar {
	
	private Kitap kitap;	
	private String adi, soyadi, kitapAdi;
	private String bilgi;
	//----------------------
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	//----------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//----------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//----------------------
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	//----------------------	
	public String getBilgi() {
		return bilgi;
	}
	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	//----------------------	
	@Override
	public String toString() {
		return 
				"Yazar :" + getAdi() + " " + getSoyadi() + 
				"\nKitap:" + getKitapAdi() + 
				"\nISBN :" + getKitap().getEserISBN() ;
	}
	
	
	
	
}
