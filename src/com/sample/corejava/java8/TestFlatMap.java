package com.sample.corejava.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap {
	public static void main(String[] args) {
		List<String> myList = Stream.of("a", "b")
				  .map(String::toUpperCase)
				  .collect(Collectors.toList());
				System.out.println(myList);
	
				List<List<String>> list = Arrays.asList(
						  Arrays.asList("a"),
						  Arrays.asList("b"));
						System.out.println(list);
	
						
		List<String> updatedList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		updatedList.forEach(System.out::println);
		List<String> updatedList2 = updatedList.stream().map(String::toUpperCase).collect(Collectors.toList());
		updatedList2.forEach(System.out::println);
		
		Optional<String> s = Optional.of("test");
		System.out.println((Optional.of("TEST").equals(s.map(String::toUpperCase))));
	
	
	}
}
