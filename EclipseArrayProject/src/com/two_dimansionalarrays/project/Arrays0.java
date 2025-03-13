package com.two_dimansionalarrays.project;

public class Arrays0 {
	public static void print2d(int [][]a) 
	{
		a[1][1]=5;
		a[2][2]=14;
		for(int i = 0; i<a.length; i ++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(a[1][2]);
	}
	
	public static void main(String [] args)
	{
		int a [][]= new int [3][4];
		print2d(a);
	}
}
