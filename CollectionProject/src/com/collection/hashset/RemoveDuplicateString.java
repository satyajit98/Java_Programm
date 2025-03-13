package com.collection.hashset;

import java.util.Arrays;
import java.util.HashSet;

// WAP to remove duplicate words from string.
public class RemoveDuplicateString {
	
	public static void removeDuplicateString(String[] str) {
		HashSet<String> hs = new HashSet<>();
		for(String st: str) {
			hs.add(st);
		}
		System.out.println(hs);
	}
	
	// find duplicates string
	public static void findDuplicates(String[] str) {
		HashSet<String> hs = new HashSet<>();
		HashSet<String> duplicates = new HashSet<>();
		for(String st: str) {
//			if(hs.add(st)== false) {
//				duplicates.add(st);
//			}
			if(!hs.add(st)) {
				duplicates.add(st);
			}
		}
		System.out.println(duplicates);
	}

	public static void main(String[] args) {
		// Remove duplicates words from a string
		String s = "big black bug is sitting on big black nose of big black dog";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));
		removeDuplicateString(str);
		findDuplicates(str);
	}
}
