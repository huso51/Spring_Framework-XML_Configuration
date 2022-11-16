package com.mimaraslan;

public class Musteri {
	
	private Siparis siparis;
	//-------------------------	
	public Musteri() {
		System.out.println("Musteri sınıfının boş parametreli yapılandırıcısı");		
	}
	//-------------------------
	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	//-------------------------
	public void hesabiOde() {
		System.out.println("Müşteri sınıfındaki hesabiOde metodu.");
		siparis.toplamSonucuAl();
	}
	
}
