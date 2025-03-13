package com.collection.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		String s = "big black bug is sitting on big black nose of big black dog";
		String[] str = s.split(" ");
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for(String st: str) {
			lhs.add(st);
		}
		System.out.println(lhs);
	}
}
