package com.sample.corejava.java8;

public class LambdaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaGreeting lambdaG = (s)-> {
			System.out.println("Hello->"+s);
			System.out.println("Welcome to you "+s);
			
		};
		lambdaG.greet("Naresh");
		
	}

}
