package com.tnsif.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<Integer> evensq=numbers.stream()
				
		.filter(n-> n%2==0)
		.map(n->n*n)
		
		.collect(Collectors.toList());
		System.out.println("even square"+evensq);
	}

}
