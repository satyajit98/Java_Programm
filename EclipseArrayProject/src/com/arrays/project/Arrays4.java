package com.arrays.project;
// even or odd
public class Arrays4 {

	public static void main(String[] args) {
		int[] arr1 = {12,14,15,23, 37,18,78,48,90};
		for(int i = 0; i<=arr1.length - 1; i++)
			if(arr1[i] %2 != 0)//if(arr1[i] % 2 == 0)
				System.out.print(arr1[i]+ " ");
	}
}
