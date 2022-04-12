package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {
	
	public ChessCoach() {
		System.out.println(">> chesscoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Check him!";
	}

}
