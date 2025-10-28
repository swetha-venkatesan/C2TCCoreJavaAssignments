package com.tnsif.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class collectiondemo {

	public static void main(String[] args) {
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
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
//		generic concept
//		it will allow only same datatype -collection
		
		List<String> names = new ArrayList(); 
//		array list is the basic concept can be indexed,ordered
		names.add("swetha");
		names.add("moni");
		names.add("deepz");
		names.add("hemanth");
		names.add("pavi");
		
		System.out.println("list "+names);
//		sorting
//		in reverse order
		Collections.reverse(names);
		System.out.println("in reverse "+names);
//		in ascending order
		Collections.sort(names);
		System.out.println("sorted names " + names);
		
		System.out.println();
		System.out.println("traversal");
		System.out.println();

//		traversal means visiting each and every element that are present in list
//		Iterator is used
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println("name list "+nm);
			
			if(nm.equals("deepz"));
			i.remove();
//			System.out.println("after removing "+names);

			
		}
		System.out.println();

		System.out.println("name list is "+names);
		System.out.println();
		System.out.println();

		
		

		

	}

}
