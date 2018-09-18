package com.sample.corejava.java8;

import java.util.Arrays;
import java.util.List;

public class TestFinallyBlock {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		testMethod();
		
	}

	public static void testMethod() throws Exception {
		
		try {
			List<String> a = Arrays.asList("Naresh" , "Mallik"); 
			System.out.println(a.get(4));
		}catch(Exception e) {
			throw new Exception("Rethrown");
		}finally {
			System.err.println("Insider Finally Block");
		}
		
	}
}
