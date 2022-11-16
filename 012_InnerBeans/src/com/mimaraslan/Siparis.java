package com.mimaraslan;

public class Siparis {

	int tutar;
	//-------------------------
	public Siparis() {
		System.out.println("Sipariş sınıfının boş parametreli yapılandırıcısı");		
	}
	//-------------------------
	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	//-------------------------
	public void toplamSonucuAl() {
		System.out.println("Sipariş sınıfındaki toplamSonucuAl metodu");
		System.out.println("TOPLAM: " + getTutar());
	}
	
	
}
