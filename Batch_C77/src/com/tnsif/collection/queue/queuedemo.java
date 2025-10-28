package com.tnsif.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queuedemo {

public static void main(String[] args) {
		
		//Add the elements
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < 5; i++)
		{
			q.add(i);
		}
		
		//Display the elements
		System.out.println("Elements of Queue: "+q);
		
		//To remove the head of queue
		int removable = q.remove();		
		System.out.println(removable);
		
		//To view the head of the element
		int head = q.peek();
		System.out.println(head);
		
		//find size of the queue
		int size = q.size();
		System.out.println(size);
		
		
	}
}
