package com.qa.tutorial;

public class Runner {

	public static void main(String[]args) {
		
		Interaction runner = new Interaction();  // created an instance of runner so it will be able to run non-static methods (greeting and insult)
		
		System.out.println(runner.greeting() + " " + runner.insult());
	}}
	
	