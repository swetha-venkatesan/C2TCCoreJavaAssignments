package com.tnsif.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class basis {

	public static void main(String[] args) {
		
		Stream<Integer> stream=Stream.of(20,40,60,80,100,120,140,160);
		System.out.println("numbers of elements : " + stream.count());
		Integer[] values=new Integer[] {20,60,100,140,160,180,200};
		stream = Arrays.stream(values);

		
		
		
		
		
		
		System.out.println("Squares of " + Arrays.toString(values) + " is as follows :");
		//stream.map(num -> num * num).forEach(System.out::println);
		stream=stream.map(m->m*m);
		stream.forEach(System.out::println);
		
		System.out.println("First 2 elements are : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		System.out.println("Distinct Elements are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
		
		Stream<String> stream1 = words.stream();
		
		System.out.println("Strings in uppercase : ");
		List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		stream1 = words.stream();
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);

		
		
		
	}
}
