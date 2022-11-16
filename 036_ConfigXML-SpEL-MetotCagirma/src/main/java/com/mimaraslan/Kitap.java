package com.mimaraslan;


public class Kitap {
	
	private String eserAdi;
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
