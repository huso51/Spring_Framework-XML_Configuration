package com.mimaraslan;

public class Ucgen {
	
	private String cesit; 
	//--------------------------
	/**
	 * @return the cesit
	 * @author mimaraslan
	 * @since 14.10.2015
	 */
	public String getCesit() {
		return cesit;
	}

	/**
	 * @param cesit the cesit to set
	 */
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	//--------------------------
	public void ciz() {
		System.out.println(getCesit() +  " Üçgen çiz");
	}
	
}
