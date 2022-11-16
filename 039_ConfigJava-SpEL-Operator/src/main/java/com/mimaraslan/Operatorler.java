package com.mimaraslan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("operatorlerBean")
public class Operatorler {
	
	
	
	//1.İliskisel - Relational
	@Value("#{sayilarBean.sayi1 eq 10 }")
	private boolean equalTest;
	
	private boolean notEqualTest;
	private boolean lessThanTest;
	private boolean lessThanOrEqualTest;
	private boolean greaterThanTest;
	private boolean greaterThanOrEqualTest;
	
	//2.Mantiksal - Logical
	@Value("#{(sayilarBean.sayi1 eq 10) and (1299 == 1453) }")
	private boolean andTest;
	private boolean orTest;
	private boolean noTest;

	//3.Matematik - Mathematical
	private double addTest; //toplama
	private String addStringTest; // taopla sonuc string
	private double substractionTest; //cikarma
	private double multiplicationTest; //carpma
	private double divisionTest; //bolme
	private double modulusTest; //modül
	private double exponentialTest; //üzeri üssü
	
	public boolean isEqualTest() {
		return equalTest;
	}
	public void setEqualTest(boolean equalTest) {
		this.equalTest = equalTest;
	}
	public boolean isNotEqualTest() {
		return notEqualTest;
	}
	public void setNotEqualTest(boolean notEqualTest) {
		this.notEqualTest = notEqualTest;
	}
	public boolean isLessThanTest() {
		return lessThanTest;
	}
	public void setLessThanTest(boolean lessThanTest) {
		this.lessThanTest = lessThanTest;
	}
	public boolean isLessThanOrEqualTest() {
		return lessThanOrEqualTest;
	}
	public void setLessThanOrEqualTest(boolean lessThanOrEqualTest) {
		this.lessThanOrEqualTest = lessThanOrEqualTest;
	}
	public boolean isGreaterThanTest() {
		return greaterThanTest;
	}
	public void setGreaterThanTest(boolean greaterThanTest) {
		this.greaterThanTest = greaterThanTest;
	}
	public boolean isGreaterThanOrEqualTest() {
		return greaterThanOrEqualTest;
	}
	public void setGreaterThanOrEqualTest(boolean greaterThanOrEqualTest) {
		this.greaterThanOrEqualTest = greaterThanOrEqualTest;
	}
	public boolean isAndTest() {
		return andTest;
	}
	public void setAndTest(boolean andTest) {
		this.andTest = andTest;
	}
	public boolean isOrTest() {
		return orTest;
	}
	public void setOrTest(boolean orTest) {
		this.orTest = orTest;
	}
	public boolean isNoTest() {
		return noTest;
	}
	public void setNoTest(boolean noTest) {
		this.noTest = noTest;
	}
	public double getAddTest() {
		return addTest;
	}
	public void setAddTest(double addTest) {
		this.addTest = addTest;
	}
	public String getAddStringTest() {
		return addStringTest;
	}
	public void setAddStringTest(String addStringTest) {
		this.addStringTest = addStringTest;
	}
	public double getSubstractionTest() {
		return substractionTest;
	}
	public void setSubstractionTest(double substractionTest) {
		this.substractionTest = substractionTest;
	}
	public double getMultiplicationTest() {
		return multiplicationTest;
	}
	public void setMultiplicationTest(double multiplicationTest) {
		this.multiplicationTest = multiplicationTest;
	}
	public double getDivisionTest() {
		return divisionTest;
	}
	public void setDivisionTest(double divisionTest) {
		this.divisionTest = divisionTest;
	}
	public double getModulusTest() {
		return modulusTest;
	}
	public void setModulusTest(double modulusTest) {
		this.modulusTest = modulusTest;
	}
	public double getExponentialTest() {
		return exponentialTest;
	}
	public void setExponentialTest(double exponentialTest) {
		this.exponentialTest = exponentialTest;
	}

}
