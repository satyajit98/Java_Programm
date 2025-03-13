package com.arrays.project;
// print sum of all array element in different method
public class Arrays5 
{

	public static int sumOfValues(int x[]) {
		int sum = 0;
		for(int i = 0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;

	}
	public static void main(String[] args) {
		int[] a = {1,4,3};
		int sum = sumOfValues(a);
		System.out.println(sum);
		
	}
}
