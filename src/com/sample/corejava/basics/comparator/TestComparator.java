package com.sample.corejava.basics.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sample.test.bean.Employee;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Employee> empList =  Arrays.asList(
				new Employee(152179, "Naresh", "Pedem", 2000),
				new Employee(163179, "Mallik", "Pedem", 4023),
				new Employee(122179, "Anand", "Pedem", 13000),
				new Employee(137179, "Suresh", "Verma", 52000),
				new Employee(189179, "Magesh", "Sharma", 82000),
				new Employee(111179, "Geetha", "Jella", 12000),
				new Employee(100179, "Chidvilasini", "Pedem", 92000));
		
		
	
		List<Employee> copyList =  new ArrayList<Employee>(empList.size());
		
		for(Employee e : empList) {
			copyList.add(e.clone());
		}
		
		for(Employee e : copyList) {
			e.setEmpSalary(6666);
		}
		
		Collections.sort(empList);
		
		empList.forEach(System.out::println);
		
		System.out.println("*********COpy of Emp Dta**********************8");
		
		
		copyList.forEach(System.out::println);
		
		
		System.out.println("*******************************8");
		
		
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<String> strArray = new ArrayList<String>();
		strArray.add("Naresh");
		strArray.add("Xaresh");
		strArray.add("Caresh");
		strArray.add("Baresh");
		strArray.add("Zaresh");
		strArray.add("Aaresh");
		strArray.add("Uaresh");
		
		List<String> newStrList =  new ArrayList<String>(strArray.size());
		
		for(String s:strArray) {
		newStrList.add(s);	
		}
		
		newStrList.forEach(System.out::println);
		
		strArray.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("After Sort");
		
		strArray.forEach(System.out::println);
		
		System.out.println("Copy data After Sort");
		
		newStrList.forEach(System.out::println);

		List<String> strArray2 = Arrays.asList("Wello" ,"Apple", "Zebra","How are you","Naresh","Pendem","Mallik" );

		Collections.sort(strArray2);
		
		Stream.iterate(Math.random(), n->n+2)
        .peek(num -> System.out.println("Peeked at:"+num))
        .limit(5)
        .forEach(System.out::println);
	}
	
}
