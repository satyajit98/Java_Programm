package com.collection.assignment;

import java.util.ArrayList;

//assignment: WAP to store multiple object in arraylist and perform the below following opertaion
//	1. print only character object A-F
//	2. print only integer object 50-100
//	3. print only String object start with s
//	4. print only string object ends with a

public class MultipleObject {
	
	public static void printMultipleObject(ArrayList arr) {
		System.out.println("-------------------");
		System.out.println("---- print character a to f----");
		System.out.println("-------------------");
		for(Object ar1 : arr) {
			if(ar1 instanceof Character) {
				char ch = (char) ar1;
				if(ch>= 'a' && ch<= 'f') {
					System.out.println(ch);
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("---- print integer 50 to 100----");
		System.out.println("-------------------");
		for(Object ar2: arr) {
			if(ar2 instanceof Integer) {
				Integer no = (Integer)ar2;
				if(no>= 50 && no<= 100) {
					System.out.println(no);
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("---- print string start with 's'---- ");
		System.out.println("-------------------");
		
		for(Object ar3 : arr) {
			if(ar3 instanceof String) {
				String s = (String) ar3;
				if(s.startsWith("s")) {
					System.out.println(s);
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("---- print string ends with 'a'---- ");
		System.out.println("-------------------");
		
		for(Object ar4 : arr) {
			if(ar4 instanceof String) {
				String s = (String) ar4;
				if(s.endsWith("a")) {
					System.out.println(s);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add('s');
		arr.add(34);
		arr.add('a');
		arr.add('f');
		arr.add('g');
		arr.add("satyajit");
		arr.add("sheela");
		arr.add(87);
		arr.add('d');
		arr.add("santi");
		arr.add("ramula");
		arr.add(101);
		arr.add(100);
		arr.add("ramu kaka");
		arr.add(52);
		arr.add(50);
		arr.add('h');
		
		printMultipleObject(arr);
	}

}
