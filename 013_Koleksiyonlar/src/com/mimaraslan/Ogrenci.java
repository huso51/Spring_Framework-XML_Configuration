package com.mimaraslan;

import java.util.*;

public class Ogrenci {
		
	List <?> ogrenciList;
	Set  <?> ogrenciSet;
	Map  <?,?> ogrenciMap;
	Properties  ogrenciProperties;
	
    //-------------------------------------------------
	public List<?> getOgrenciList() {
		System.out.println("List elemanları :" + ogrenciList);
		return ogrenciList;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	//-------------------------------------------------
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanları :" + ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	//-------------------------------------------------
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanları :" + ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	//-------------------------------------------------
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanları :" + ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
	
	
	
}
