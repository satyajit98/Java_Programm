package com.collection.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
// WAP to Store multiple objects of integer type and sort in assending order.
public class SortInAscendingOrder {
	
	public static void sortInAscendingOrder(HashSet<Integer> hs) {
		LinkedList<Integer> ll = new LinkedList<>(hs);
		Collections.sort(ll);
		System.out.println(ll);
	}

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(45);
		hs.add(3);
		hs.add(34);
		hs.add(78);
		hs.add(89);
		sortInAscendingOrder(hs);
	}
}
