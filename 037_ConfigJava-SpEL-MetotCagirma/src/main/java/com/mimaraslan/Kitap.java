package com.mimaraslan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapBean")
public class Kitap {
	
	@Value("Savaş ve Barış")
	private String eserAdi;
	
	@Value("1234567890")
	private long eserISBN;
	//------------------
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	//------------------
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	//------------------
	public String kitapBilgisiniYaz(String yazaAdi, String yazarSoyadi, String eserAdi, long eserISBN) {

		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;
		
		return  "\n\t YAZAR : " + yazaAdi + " " + yazarSoyadi + 
			    "\n\t KİTAP : " + getEserAdi() + 
				"\n\t ISBN  : " + getEserISBN() ;
	}
	
}
