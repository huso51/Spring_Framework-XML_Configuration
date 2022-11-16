package com.mimaraslan;

public class B {
	
	private A aNesnesi;
	
	public B (A aNesnesi) {
		System.out.println("B sınıfının hazırlayıcısı");
		this.aNesnesi = aNesnesi;
	}
	
	public void sonucuGoster() {
		System.out.println("B sınıfının bir metodu");
		aNesnesi.konsolaYaz();
	}
}
