package com.mimaraslan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextOlayKapatmaIsleyicisi implements ApplicationListener<ContextClosedEvent>{

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("----ContextClosedEvent (Context Olay Kapatma)");
		
	}

	

}
