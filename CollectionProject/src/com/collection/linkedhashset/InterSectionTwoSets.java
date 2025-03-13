package com.collection.linkedhashset;

import java.util.LinkedHashSet;
// WAP to find the intersection of two sets.
public class InterSectionTwoSets {

	// intersection
	public static void interSection(LinkedHashSet<Integer> lhs1, LinkedHashSet<Integer> lhs2) {
		lhs1.retainAll(lhs2);
		System.out.println(lhs1);
	}
	// union
	public static void union(LinkedHashSet<Integer> lhs1, LinkedHashSet<Integer> lhs2) {
		lhs1.addAll(lhs2);
		System.out.println(lhs1);
	}
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(10);
		lhs1.add(2);
		lhs1.add(8);
		lhs1.add(9);
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		lhs2.add(7);
		lhs2.add(2);
		lhs2.add(9);
		lhs2.add(10);
//		interSection(lhs1, lhs2);
		union(lhs1, lhs2);
	}
}
