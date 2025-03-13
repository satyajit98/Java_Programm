package com.arrays.project;

import java.util.Arrays;

// return an array
public class Arrays7 {

	public static int[] returningArray() {
		int a[] = {14,15,17,2,4,5};
		return a;
	}
	public static void main(String[] args) {
		int a[] = returningArray();
		System.out.println(a.length);
		System.err.println(Arrays.toString(a));
	}
}
