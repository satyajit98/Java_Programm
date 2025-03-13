package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

// WAP to store different object in arraylist and convert into linkedlist and print the value
public class ConvertArrayToLinked {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(40);
		al.add("Satyait");
		al.add(true);
		al.add('s');
		
		LinkedList ll = new LinkedList(al); // converting the arraylist to linkedlist
		System.out.println(ll);
	
	}
}
