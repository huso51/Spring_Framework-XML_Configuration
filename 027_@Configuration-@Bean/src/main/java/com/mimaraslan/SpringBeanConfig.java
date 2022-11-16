package com.mimaraslan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
	
	@Bean
	public Sehir sehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Manisa");
		sehir.setPlakaNo(45);
		return sehir;
	}

/*
	<bean id="sehir" class="com.mimaraslan.Sehir">
		<property name="sehirAdi" value="Manisa"/>
		<property name="plakaNo" value="45"/>
	</bean>
		
 */

	@Bean
	public Ogrenci ogrenci(){
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(sehir());
		return ogrenci;
	}
	
	
/*
<bean id="ogrenci" class="com.mimaraslan.Ogrenci">
	<property name="sehir">
			<ref bean="sehir"/>
	</property>
</bean>	
*/	
	
}
