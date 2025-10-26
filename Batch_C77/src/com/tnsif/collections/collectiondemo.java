package com.tnsif.collections;

import java.util.ArrayList;
import java.util.List;


public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li1=new ArrayList();
		System.out.println("size"+li1.size());
		System.out.println("is list empty "+ li1.isEmpty());
		li1.add(10);
		li1.add("hi");
		li1.add("is");
		li1.add(true);
		li1.add(false);
		li1.add(11);

		System.out.println("list is" + li1);
		
		System.out.println("is list contains 10"+ li1.contains(10));
		
		li1.remove(false);
		System.out.println("list is"+ li1);
		System.out.println("element at 3rd position is "+li1.get(3));
		
		System.out.println("size"+li1.size());
		System.out.println("is list empty "+ li1.isEmpty());

		
//		System.out.println(li1.remove(li1.lastIndexOf(2)));
//		System.out.println(li1.remove(li1.indexOf(2)));

		System.out.println("before clearing list out "+ li1);
		System.out.println("after clearing out");
		li1.clear();
		System.out.println("list is"+li1);
		
		

		

	}

}
