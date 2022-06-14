package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties3")
public class SportConfigAct7 {
	
// define bean for our sad fortune service
	@Bean
	public FortuneService sillyFortuneService() {
		return new SillyFortuneService();
	}
	
// define bean for out swim coach and inject dependency
	@Bean
	public Coach hockeyCoach() {
		return new HockeyCoach(sillyFortuneService());
	}
	
}
