package com.mimaraslan.test;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.mimaraslan.Emniyet;
import com.mimaraslan.Memur;
import com.mimaraslan.Okul;
import com.mimaraslan.Polis;

public class TestMemur {

	@Test
	public void polisGorevTestEt() {
		
		Emniyet mockGorevNesnesi  = mock(Emniyet.class);
		
		Polis polis = new Polis(mockGorevNesnesi);
		polis.calis();
		
		verify(mockGorevNesnesi,times(1)).gorevVer();;
		
	}
	
/*	@Test
	public void ogretmenGorevTestEt() {
		Okul
	}*/
}
