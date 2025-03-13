package com.inbuiltmethodofstring;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String s = "     I,      am,       super,  hero     ";
		String[] str = s.split(",");
//		System.out.println(Arrays.toString(str));
		for(String x : str) {
//			System.out.println(x.trim());
			System.out.print(x.trim()+" ");
		}
	}
}
