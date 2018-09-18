package com.sample.corejava.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] z = new int[5];
		z[0] = 1;
		z[1] = 2;
		
		z[0] = 3;
		z[0] = 7;
		
		
		for(int x : z) {
			System.out.println(x);
		}
		
		String[] st = new String[3];
		st[0] = "Maresj";
		
		for(String x : st) {
			System.out.println(x+"--"+st.length);
		}

		
		Set<String> tSet = new TreeSet<>(); 
		tSet.add("Naresh");
		tSet.add("Geetha");
		tSet.add("Mallik");
		tSet.add("Anand");
		tSet.add("Chidvilasini");
		
		Iterator<String> it = tSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
