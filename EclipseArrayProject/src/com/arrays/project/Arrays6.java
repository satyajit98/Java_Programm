package com.arrays.project;
// pass an array to another method
import java.util.Arrays;

public class Arrays6 {
	
	public static void printTheValues(int[]x) {
		System.out.println(Arrays.toString(x));

	}

	public static void main(String[] args) {
		int[] a = {14,15,18,78};
		printTheValues(a);
		
	}
}
