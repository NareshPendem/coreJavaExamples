package com.sample.corejava.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import clover.com.google.common.primitives.Ints;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.println(n1+" "+n2);//printing 0 and 1    
		 int[] fibs = {0, 1};
		
		 List<String> strArray = Arrays.asList("Naresh", "Geetha");
		 
		 
		 
		 String[] strArray2 = {"Naresh","Mallik"};
		 
		 List<String> newAList = Arrays.asList(strArray2);
		
		 
		for(int x : fibs) {
			System.out.println(x);
		}

		 
		 
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  
		 // aList.add(3);
		  n1=n2;    
		  n2=n3;    
		 } 
		 
		 
		// System.out.println(aList);
		 
		 
/*		 Stream<Integer> fibonacci = Stream.generate(() -> {
		     int result = fibs[1];
		     int fib3 = fibs[0] + fibs[1];
		     fibs[0] = fibs[1];
		     fibs[1] = fib3;
		     return result;
		 });*/
		 

		 
/*		 fibonacci.filter((x) -> {
			
			 if(x <= 20) {
				 return true;
			 }
			return false;
		 }).collect(Collectors.toList()).forEach(System.out::println);*/
	}

}
