package com.arrays.project;

public class Arrays8 {
	
	public static void printValue(int [][]a) 
	{
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int [][] a = {{5,2,1},{6,8,3},{32,12,5}};
		printValue(a);
	}

}
