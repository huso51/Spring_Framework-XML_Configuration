package com.mimaraslan.services.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AopGorevleri implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		if (method.getName().equals("adiSoyadKontrolEt")) {
			System.out.println("\n\n**** ÖNCE ****" );
		}		
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		if (method.getName().equals("adiSoyadKontrolEt")) {
			System.out.println("**** SONRA ****\n\n" );
		}					
	}
	
	
	public void afterThrowing(NullPointerException e) throws Throwable {

			System.out.println("\n\n**** İSTİSNADAN SONRA ****" );
		
	}

}
