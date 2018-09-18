package com.sample.corejava.basics.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "anagram";
		String s2 = "margana";
		List<String> aList1 = new ArrayList<>();
		
		char[] a1 =  s1.toCharArray();
		for(char a : a1) {
			aList1.add(String.valueOf(a));
		}
		
		List<String> aList2 = new ArrayList<>();
		
		char[] a2 =  s2.toCharArray();
		for(char a : a2) {
			aList2.add(String.valueOf(a));
		}
		//aList2.add("a");
	
		List<String> n1 = Arrays.asList("Naresh" , "Geetha" , "Mallik" , "Naresh", "Geetha", "Naresh");
		//n1.remove(1);

		List<String> n2 = Arrays.asList("Mallik");
		
		//System.out.println(n1.removeAll(n2));
		System.out.println(n1);
		
		Collections.sort(aList1);
		Collections.sort(aList2);
		
		boolean anagram = aList1.equals(aList2);
		
		aList1.forEach(System.out::println);
		aList2.forEach(System.out::println);
		
		
		System.out.println("anagram-->"+anagram);
	}
	
	

}
