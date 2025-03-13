package com.arrays.project;
// print array elements in reverse direction using foreach loop
public class ArraysForEach1 {

	public static void main(String[] args) {
		
		int[] a = {5,3,2};
		int count = 0; 
		for(int x : a) {
			System.out.print(a[a.length-count-1]+" ");
			count ++;
		}
	}

}
