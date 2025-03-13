package com.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

// add different object in hashset and iterate in any 4 ways.

public class IterateHashset {

	public static void iterateHashSetIn4Ways(HashSet hs) {
		// 1. for each loop
		System.out.println("---------------------");
		System.out.println("Using for each loop");
		System.out.println("---------------------");
		for(Object it : hs) {
			System.out.println(it);
		}
		
		// 2. Using iterator
		System.out.println("---------------------");
		System.out.println("Using for iterator");
		System.out.println("---------------------");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 3. Using toArray
		System.out.println("---------------------");
		System.out.println("Using for toArray and for loop");
		System.out.println("---------------------");
		Object[] o= hs.toArray();
		for(int i = 0; i<o.length; i++) {
			System.out.println(o[i]);
		}
		// 4. convert into arraylist and using listiterator
		System.out.println("---------------------");
		System.out.println("converting into arraylist and listIterator");
		System.out.println("---------------------");
		ArrayList al = new ArrayList(hs);
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	}
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Satyajit");
		hs.add(25);
		hs.add('c');
		hs.add(45.68);
		iterateHashSetIn4Ways(hs);
	}
}
