package com.sample.corejava.basics.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMatchingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "How naresh anand anand are you naresh mallik naresh geetha";
		String[] a = inputString.split(" ");
		Map<String,Integer> wordMap = new HashMap<>();
		for(String x : a) {
			if(wordMap.containsKey(x)) {
				wordMap.put(x, Math.addExact(Integer.valueOf(wordMap.get(x)),1));
			}else {
				wordMap.put(x,1);
			}
		}
		wordMap.keySet().forEach(System.out::println);
		wordMap.values().forEach(System.out::println );
		System.out.println(wordMap);
		
		
		String dup = "pendem";
		Map<String,Integer> charMap = new HashMap<>();
		for(char s : dup.toCharArray()) {
			String x = String.valueOf(s);
			//( charMap.containsKey(x) ? (charMap.put(x,Math.addExact(Integer.valueOf(wordMap.get(x)),1))) : charMap.put(x, 1));
			
			if(charMap.containsKey(x)) {
				charMap.put(x,Math.addExact(Integer.valueOf(charMap.get(x)),1));	
			}else {
				charMap.put(x, 1);
			}
		}
		
		System.out.println(charMap);
	}

}
