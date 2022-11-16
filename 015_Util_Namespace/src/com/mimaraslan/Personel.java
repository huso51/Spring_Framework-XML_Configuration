package com.mimaraslan;

import java.util.*;

public class Personel {
		
	List <?> listemiz;
	Set  <?> setimiz;
//	Map  <?,?> mapimiz;
//	Properties  propertymiz;
	
    //-------------------------------------------------
	
	public List<?> getListemiz() {
		return listemiz;
	}

	public void setListemiz(List<?> listemiz) {
		this.listemiz = listemiz;
	}
    //-------------------------------------------------
	
	public Set<?> getSetimiz() {
		return setimiz;
	}

	public void setSetimiz(Set<?> setimiz) {
		this.setimiz = setimiz;
	}
	 //-------------------------------------------------

	@Override
	public String toString() {
		return "Personel [listemiz=" + listemiz + "\n setimiz=" + setimiz + "]";
	}
	
	
	

	
	
}
