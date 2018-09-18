package com.sample.corejava.basics.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeFactor {

	private static int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		num  = n;
	    scanner.close();
	    
	    int[] primeList =  Stream.iterate(2, x -> x+1).limit(n-2).filter(PrimeFactor::isDivisible).filter(PrimeFactor::isSelfDivisible).mapToInt(x -> x).toArray();
	    
	    System.out.println(Arrays.toString(primeList));
	}

	public static boolean isDivisible(int x) {
		 if( num % x == 0) {
			 return true;	
		}
		 return false;
	}
	
	public static boolean isSelfDivisible(int x) {
		
		for(int i=2;i < x ; i ++) {
			if(x %i == 0) {
				return false;
			}
		}
			return true;
		}
	
}
