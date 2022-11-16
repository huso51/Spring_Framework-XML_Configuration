package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mimaraslan.config.SpringBeanConfig;

public class Merkez {

	
	public static void main(String[] args) {
		

		
	    AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
	    appCtx.register(SpringBeanConfig.class);
	    
	    appCtx.refresh();
	    
	  A aNesnesi = (A) appCtx.getBean("beanA");
	  aNesnesi.yaz("Güzel gören, güzel düşünür.");  
	  
	  
	  B bNesnesi = appCtx.getBean("beanB", B.class);
	  bNesnesi.yaz("Güzel düşünen, hayatından lezzet alır.\n B.S.N.");
	  
	    
	  
	  
	   ((ConfigurableApplicationContext) appCtx).close();

	}

}
