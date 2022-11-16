package com.mimaraslan;

public class Ogretmen implements Memur {

	private Gorev gorev;
	
	public Ogretmen(Gorev gorev) {
		this.gorev = gorev;
	}

	@Override
	public void calis() {
		gorev.gorevVer();
	}

}
