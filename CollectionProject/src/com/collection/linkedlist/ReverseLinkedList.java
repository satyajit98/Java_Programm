package com.collection.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// WAP to reverse a linkedlist(08/03/25).

public class ReverseLinkedList {

	public static void reverseLinkedList(LinkedList<Integer> list) {
		List<Integer> reverseList = new LinkedList<Integer>();//empty list
		
		Iterator<Integer> i = list.descendingIterator();
		while(i.hasNext()) // sorting in reverseList in reverse direction of originalList
		{
			reverseList.add(i.next());
		}
		System.out.println("After Reverse"+reverseList);
	}
	//Using inbuilt method
	public static void reverseWithInbuildMethod(LinkedList<Integer> list) {
		Collections.reverse(list);
		System.out.println("After reverse using inbuild method"+ list);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(45);
		li.add(34);
		li.add(65);
		li.add(48);
		System.out.println("Before Reverse"+li);
		reverseLinkedList(li);
		reverseWithInbuildMethod(li);
	}
}
