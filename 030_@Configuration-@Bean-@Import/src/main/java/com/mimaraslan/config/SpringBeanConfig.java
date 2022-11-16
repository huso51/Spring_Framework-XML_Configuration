package com.mimaraslan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.mimaraslan.*")
@Import({AConfig.class, BConfig.class})
public class SpringBeanConfig {
	
	
	
}
