package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	// Activity #6 bean scope with annotations
	
	  @PostConstruct
	  @Value("${foo.fortunes}") 
	  public void getTextFile() { 
		  String data = ("${foo.fortunes}");
	  System.out.println(data); }
	 
	
	@Value("${foo.fortunes}")
	private String[] data = {
			/*
			 * "Beware of the wolf in sheep's clothing",
			 * "Diligence is the mother of good luck", "The journey is the reward"
			 */
	};
	
	// create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random fortune from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
