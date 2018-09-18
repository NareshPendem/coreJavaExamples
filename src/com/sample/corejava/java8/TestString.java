package com.sample.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestString {
	
	private String asd = "";

	public static void main(String[] args) {
		
		String str = "Naresh Here";
		
		String str2 = "Geetha Here";
		
		new TestString().reverseString(str);
		

		
	}
	
	public void reverseString(String str) {
		
		StringBuilder sbf = new StringBuilder(str).reverse();
		
		List myList = Arrays.asList(new String("String 1"),
				new String("String 2"),
				new String("String 3"));
		
		myList.forEach(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				// TODO Auto-generated method stub
				arg0.contains("2");
			}

		});
		
		
	}
}
