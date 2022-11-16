package com.mimaraslan;

public class Polis implements Memur {

	private Gorev gorev;
	
	public Polis(Gorev gorev) {
		this.gorev = gorev;
	}

	@Override
	public void calis() {
		gorev.gorevVer();
	}

}
