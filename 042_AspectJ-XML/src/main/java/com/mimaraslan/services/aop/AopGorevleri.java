package com.mimaraslan.services.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

//@Aspect
public class AopGorevleri {

	//@Before("execution(* com.mimaraslan.model.Personel.adiSoyadKontrolEt(..))")
	public void ilkGorev(JoinPoint joinPoint) throws Throwable {
			System.out.println("\n\n**** ÖNCE **** " );
	}
	
	
/*
	@AfterReturning("execution(* com.mimaraslan.model.Personel.adiSoyadKontrolEt(..))")
	public void geriDonusGorev(JoinPoint joinPoint) throws Throwable {
			System.out.println("**** GERI DONUS DEGERINDEN SONRA **** \n\n" );
	}
	
	@AfterThrowing("execution(* com.mimaraslan.model.Personel.adiSoyadKontrolEt(..))")
	public void istisnaGorev(JoinPoint joinPoint) throws Throwable {
			System.out.println("**** ISTISNA MEYDANA GELDİKTEN SONRA **** \n\n" );
	}
	
	@After("execution(* com.mimaraslan.model.Personel.adiSoyadKontrolEt(..))")
	public void sonGorev1(JoinPoint joinPoint) throws Throwable {
			System.out.println("**** SONRA **** \n\n" );
	}
	
*/
	//@Around("execution(* com.mimaraslan.model.Personel.*(..))")
	public void sarGorev(ProceedingJoinPoint joinPoint) throws Throwable {
		
			System.out.println("\n**** KUSAT SARMALA ÖNCESİ  **** " +  Arrays.toString(joinPoint.getArgs()) );
			
			joinPoint.proceed(); //üstte adı geçen metot çağırılıyor.
			
			System.out.println("**** KUSAT SARMALA SONRASI  **** \n" );
			
	}
	

}
