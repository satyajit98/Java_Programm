package com.collection.satya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorArrayList {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add("satya");
	a1.add(24);
	a1.add('c');
	a1.add(null);
	a1.add(45.50f);
	
	System.out.println("----iterator using 1st way ---> using simple for loop -----");
	for(int i=0; i<a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	
	System.out.println("----iterator using 2nd way ---> using simple forEach loop -----");
	for(Object o : a1)
	{
		System.out.println(o);
	}
	
	System.out.println("----iterator using 3rd way ---> using Iterator(interface) -----");
	Iterator i = a1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
;	System.out.println("----iterator using 4th way-----");
	ListIterator l1 = a1.listIterator();
	while(l1.hasNext()) {
		System.out.println(l1.next());
	}
	System.out.println("*****");
	while(l1.hasPrevious()) {
		System.out.println(l1.previous());
	}
}
}
