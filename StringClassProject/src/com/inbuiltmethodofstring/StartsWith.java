package com.inbuiltmethodofstring;

public class StartsWith {
	public static void main(String[] args) {
		String s = "I am a student of QSpiders and JSpiders";
		System.out.println(s.startsWith("I"));
		System.out.println(s.startsWith("I am"));
		System.out.println(s.startsWith("am"));
	}
}
