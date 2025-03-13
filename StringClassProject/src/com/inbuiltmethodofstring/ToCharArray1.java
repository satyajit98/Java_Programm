package com.inbuiltmethodofstring;

import java.util.Arrays;

public class ToCharArray1 {
	 public static void main(String[] args) {
		String s = "grass is greener on other side";
		char [] c = s.toCharArray();
		for(char x : c) {
			System.out.print(x+",");
		}
		System.out.println(Arrays.toString(s.toCharArray()));
	}
}
