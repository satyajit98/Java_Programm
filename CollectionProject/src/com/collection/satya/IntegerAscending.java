package com.collection.satya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerAscending {
	
	// Sort in Ascending Order
	public static void sortInAscendingOrder(List<Integer> arr) {
		
		// sort an list
//		Collections.sort(arr);
//		System.out.println(arr);
		
		// using for loop
		for(int i=0; i<arr.size(); i++) {
			for(int j=i+1; j<arr.size(); j++) {
				if(arr.get(i)>arr.get(j)) {
					// swap
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		System.out.println(arr);
	}
	
	// Sort in Decending Order
	public static void sortInDecendingOrder(List<Integer> arr) {
		for(int i = 0; i<arr.size(); i++) {
			for(int j = i+1; j<arr.size(); j++) {
				if(arr.get(i)<arr.get(j)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		System.out.println(arr);
	}
public static void main(String[] args) {
//	List<Integer> l1 = new <Integer>ArrayList();
//	l1.add(25);
//	l1.add(14);
//	l1.add(85);
//	l1.add(10);
//	l1.add(50);
//	l1.add(65);
//	l1.add(100);
//	sortInAscendingOrder(l1);
//	sortInDecendingOrder(l1);
	
	// Taking input from user
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new <Integer>ArrayList();
	System.out.println("Enter 5 Integer values");
	for(int i = 1; i<=5; i++) {
		al.add(sc.nextInt());
	}
	sortInAscendingOrder(al);
	sortInDecendingOrder(al);
}
}
