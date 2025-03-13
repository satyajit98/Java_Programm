package com.two_dimansionalarrays.project;

class Helper
{
	public static void help(int [][] a)
	{
		
		for(int[] i : a) 
		{
			for(int j : i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
public class Arrays3 
{
	public static void main(String [] args) {
		int a [][] = {	{14,8,12},
						{5,7,9},
						{8,6,16} };
		Helper.help(a);
	}
}
