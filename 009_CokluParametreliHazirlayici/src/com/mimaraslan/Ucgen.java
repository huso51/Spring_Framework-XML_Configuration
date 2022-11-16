package com.mimaraslan;

public class Ucgen {
	
	private String cesit; 
	private int yukseklik;
	private double taban;
	//--------------------------
	public Ucgen(String cesit) {
		this.cesit = cesit;
	}
	
	public Ucgen(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public Ucgen(double taban) {
		this.setTaban(taban);
	}
	
	
	public Ucgen(String cesit, int yukseklik) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}
	
	public Ucgen(String cesit, int yukseklik, double taban) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
		this.taban = taban;
	}
	
	//--------------------------
	public String getCesit() {
		return cesit;
	}
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	
	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public double getTaban() {
		return taban;
	}

	public void setTaban(double taban) {
		this.taban = taban;
	}
	//--------------------------
	public void ciz() {
		System.out.println( "TABAN: "+getTaban() + 
				" YÜKSEKLİK:"+  getYukseklik() + 
				" ÇEŞİT: "+    getCesit());
	}

	
}
