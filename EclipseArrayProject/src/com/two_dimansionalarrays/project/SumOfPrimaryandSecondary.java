package com.two_dimansionalarrays.project;

public class SumOfPrimaryandSecondary {

	public static int sumOfPrimary(int [][]a)
	{
		int sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				if(i == j)
				{					
					sum += a[i][j];
				}
			}
		}
		return sum;
	}
	
	public static int sumOfSecondary(int [][] a)
	{
		int sum = 0;
		for(int i = 0; i <a.length; i ++)
		{
			for(int j = 0; j<a[i].length; j++) {
				if(i+j == a.length -1) {
					sum += a[i][j];
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [][] a = {	{5,2,1},
						{6,8,3},
						{32,12,5}	};
		System.out.println(sumOfPrimary(a));
		System.out.println(sumOfSecondary(a));
	}
}
