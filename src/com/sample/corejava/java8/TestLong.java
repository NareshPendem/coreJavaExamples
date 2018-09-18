package com.sample.corejava.java8;

public class TestLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long a = Long.getLong("1529008987863");
		
		System.out.println(a);
		long x = System.currentTimeMillis() - a.longValue();
		System.out.println(x);
		
	}

}
