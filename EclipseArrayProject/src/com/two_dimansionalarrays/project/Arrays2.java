package com.two_dimansionalarrays.project;

public class Arrays2 {
	public static void displayValue(int [][] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i ++)
		{
//			System.out.println(a[i]);
			for(int j = 0; j<a[0].length; j++)
			{
//				System.out.print(a[i][j]+" ");
				sum += a[i][j];
			}
//			System.out.println();
		}
		System.out.println(sum);
	}
	
	public static void main(String [] args) {
		int [][] x = {{11,7,4}, {5,12,8}, {9,3,18}};
		displayValue(x);
	}
}
