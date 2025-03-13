package com.inbuiltmethodofstring;

public class EndsWith {
	public static void main(String[] args) {
		String s = "I am a student of QSpiders and JSpiders";
		System.out.println(s.endsWith("rs"));
		System.out.println(s.endsWith("ders"));
		System.out.println(s.endsWith("piders"));
		System.out.println(s.endsWith("der"));
		System.out.println(s.endsWith("I am a student of QSpiders and JSpiders"));
	}
}
