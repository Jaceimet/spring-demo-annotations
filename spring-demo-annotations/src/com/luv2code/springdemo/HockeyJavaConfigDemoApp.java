package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HockeyJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfigAct7.class);
		
		// get the bean from the spring container
		HockeyCoach theCoach = context.getBean("hockeyCoach", HockeyCoach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get the daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods . . has the props vales injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
