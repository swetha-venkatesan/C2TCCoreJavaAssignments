package com.tnsif.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		List list1 = new ArrayList();
		System.out.println("Size: "+list1.size());
		System.out.println("Is list empty: "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.72);
		list1.add(20);
		list1.add(5,"Hi");
		list1.add(20);
		System.out.println("List is"+list1);
		
		
		System.out.println("Is list contains 15?" + list1.contains(15));
		
		
		list1.remove(false);
		System.out.println("List is"+list1);
		
		System.out.println("Element at 5th Position is:"+list1.get(5));
		
		System.out.println("element Removed: "+list1.remove(list1.lastIndexOf(20))); ///last occurance
		System.out.println("element Removed: "+list1.remove(list1.indexOf(20))); //first occurance
		
		list1.clear();
		System.out.println("List is"+list1);

		// Using Generic concept - Collection
		
		//It will allow only same data types - collection
		
		List<String> names = new ArrayList<>();
		
		names.add("Sandhiya");
		names.add("Swetha");
		names.add("Janani");
		names.add("Giridharan");
		names.add("Shruthi");

		//names.add(10);
		
		
		System.out.println("Name List is: "+names);
		
		Collections.reverse(names);
		System.out.println("reverse Name List is: "+names);
		
		Collections.sort(names);
		System.out.println("Sorting name List is: "+names);
		
		Collections.reverse(names);
		System.out.println("reverse Name List is: "+names);
		
		//Traversing a list
		
		Iterator<String> i = names.iterator();
		while(i.hasNext())
		{
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Swetha"));
			i.remove();
			
		}
		
		System.out.println(names);
		
	}

}

