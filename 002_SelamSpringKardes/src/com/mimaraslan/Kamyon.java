package com.mimaraslan;

public class Kamyon {
	private Yakit yakit;
/*
	public Kamyon() {
		this.yakit = new Yakit();
	}
*/
	
	public Kamyon(Yakit yakit) {
		this.yakit = yakit;
	}
		
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Kamyon harekete geçti.");
	}
	
}
