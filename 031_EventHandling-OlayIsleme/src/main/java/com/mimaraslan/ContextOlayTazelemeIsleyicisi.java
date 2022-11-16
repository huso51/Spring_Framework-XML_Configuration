package com.mimaraslan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextOlayTazelemeIsleyicisi implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("----ContextRefreshedEvent (Context Olay Tazeleme)");
		
	}

	

}
