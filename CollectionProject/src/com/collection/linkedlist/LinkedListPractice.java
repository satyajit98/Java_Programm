package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.offer(10);
		l1.offer(true);
		l1.offer("tomato");
		l1.offer('s');
		System.out.println(l1);
		System.out.println("---------");
		l1.offerFirst("Orange");
		System.out.println(l1);
		System.out.println("---------");
		l1.offerLast(56.28);
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1.peekFirst());
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l1);
		System.out.println("----descendingIterator()-----");
		Iterator i1 = l1.descendingIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//Ways to iterate linkedList
		System.out.println("----Ways to iterate linkedList-----");
		System.out.println("----1st way using normal for loop-----");
		for(int i = 0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("----2nd way using for each loop-----");
		for(Object o : l1) {
			System.out.println(o);
		}
		System.out.println("----3rd way using Iterator-->Forword-----");
		Iterator itrForword = l1.iterator();
		while(itrForword.hasNext()) {
			System.out.println(itrForword.next());
		}
		
		System.out.println("----4th way using Iterator-->Backword-----");
		Iterator itrBackword = l1.descendingIterator();
		while(itrBackword.hasNext()) {
			System.out.println(itrBackword.next());
		}
		
		System.out.println("----5th way using ListIterator--> middle(forword)-----");
		int middle = l1.size()/2;
		ListIterator li = l1.listIterator(middle);
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}
}
