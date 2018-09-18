package com.sample.corejava.basics;

public class TestReturnCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnBol());
	}
	
	public static boolean returnBol() {
		
		return !(isValid());
	}
	
	public static boolean isValid() {
		
		return false;
	}

	
	
}
