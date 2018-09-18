package com.sample.corejava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sample.test.bean.Transaction;

public class Java8Streams {
	


	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("^[a-zA-Z]+$");
		System.out.println(p.matcher("az").matches());
		
		
		String myStr = "Hey ^@#";
		
			char[] myStrArray = myStr.toCharArray();
			StringBuilder sbf2 = new StringBuilder("");
			System.out.println(myStr.length()+"--"+myStrArray.length);
			
		for(int i=1;i <= myStr.length();i++) {
			sbf2.append(myStrArray[myStr.length()-i]);
		}
		
		System.out.println(sbf2.toString());
		
		myStr = myStr.replaceAll("[^a-zA-Z ]", "");
		
		System.out.println(myStr);
		
		StringBuilder sbf = new StringBuilder(myStr);
		System.out.println(sbf.reverse().toString());
		
		
		List<String> strList = Arrays.asList(new String("bada"),new String("Elepahant"),new String("Animal"),
				new String("Zebra"), new String("Owl"), new String("Rabbit"), new String("Tiger"));
		
	Collections.sort(strList,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareToIgnoreCase(o1);
			}
		});
		 		
		strList.forEach(System.out::println);
		
		
		// TODO Auto-generated method stub
		List<Transaction> tList = Arrays.asList(new Transaction("GROCERY", "123144"), new Transaction("MILK", "9"),
				new Transaction("DRINK", "13"), new Transaction("GROCERY", "1"), new Transaction("GROCERY", "54"),
				new Transaction("APPLE", "12323"), new Transaction("GAS", "123"), new Transaction("MEDICAL", "9"),
				new Transaction("GAS", "13"), new Transaction("MEDICAL", "54"), new Transaction("GROCERY", "54"),
				new Transaction("GROCERY", "5"));

		List<Transaction> updatedList = new ArrayList<>();

		tList.forEach(System.out::println);

		System.out.println("-----------Before STream-----------------------");
		
		//tList.stream().filter(t -> {("GROCERY".equals(t.getType()))}).sorted().;
		
		List<String> transactionsIds = tList.stream().filter(t -> t.getType().equals("GROCERY")).map(Transaction::getTxnID).collect(Collectors.toList());
	
		System.out.println("-----------New STream-----------------------");
		transactionsIds.forEach(System.out::println);
		
		List<Integer> txnIdIntg = tList.stream().filter(t -> t.getType().equals("GROCERY")).
				map(Transaction::getTxnID).map(t -> Integer.valueOf(t)).filter(t -> t > 0).sorted().distinct().
				collect(Collectors.toList());
		
		
		//tList.stream().filter(t -> t.getType().equals("GROCERY")).map(Transaction::getTxnID).collect(Collectors.toList());
				//.map(Transaction::getTxnID).collect(Collectors.toList()));
				
		System.out.println("-----------INteger New STream-----------------------");
		txnIdIntg.forEach(System.out::println);
		
		
		tList.forEach(new Java8Streams()::txnPrinter);
		
		System.out.println("-----------After STream-----------------------");
		
		tList.forEach(t -> {
			if ("GROCERY".equals(t.getType())) {
				updatedList.add(t);
			}
		});

		System.out.println("----------------------------------");
		

		
		System.out.println("----------------------------------");
		Collections.sort(updatedList, new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
/*				if(new Integer(o1.getTxnID()) > new Integer(o2.getTxnID())) {
					return 1;
				}else if(new Integer(o1.getTxnID()) < new Integer(o2.getTxnID())) {
					return -1;
				}else {
					return 0;
				}*/
				
				return new Integer(o1.getTxnID()).compareTo(new Integer(o2.getTxnID()));
				
			}
			
		});
		
		updatedList.forEach(new Java8Streams()::txnPrinter);
	}
	



	public void txnPrinter(Transaction t) {
		System.out.println(t);
	}

}
