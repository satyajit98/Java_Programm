package com.collection.satya;

import java.util.ArrayList;

public class ClassProgram {
	
// write a programm to sum of all integer elements in arraylist(main arraylist as generic);
	public static void addInteger(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			int value = list.get(i);
			sum += value;
		}
		System.out.println(sum);
	}
// sum of only integer values from a hetrogeneous arraylist
	public static void addSumOfOnlyIntegerElements(ArrayList a2) {
		int sum = 0;
		for(Object a1: a2) {
			if(a1 instanceof Integer) {
				Integer i = (Integer)a1;
				sum+=i;
			}
		}
		System.out.println(sum);
	}
// WAP to store different object an arraylist and perform the following operation 
//	1. prin only integer objects
//	2. print only character objects
//	3. print only string objects
//	4. print only float objects
	// Integer
	public static void printDiffObjects(ArrayList list) {
		System.out.println("---- printing integer values");
		for(Object inte : list) {
			if(inte instanceof Integer) {
				System.out.println(inte);
			}
		}
		// Character
		System.out.println("---- printing character values-----");
		for(Object chara : list) {
			if(chara instanceof Character) {
				System.out.println(chara);
			}
		}
		// Float
		System.out.println("---- printing float values-----");
		for(Object floa : list) {
			if(floa instanceof Float) {
				System.out.println(floa);
			}
		}
		// String
		System.out.println("---- printing string values-----");
		for(Object stri : list) {
			if(stri instanceof String) {
				System.out.println(stri);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(540);
		addInteger(al);
		
		ArrayList a2 = new ArrayList();
		a2.add(50);
		a2.add("sheela");
		a2.add("mala");
		a2.add('c');
		a2.add(80);
		a2.add("laila");
		a2.add("29");
		a2.add(67);
		a2.add(45.69);
		addSumOfOnlyIntegerElements(a2);
		
		ArrayList a3 = new ArrayList();
		a3.add(50);
		a3.add("sheela");
		a3.add("mala");
		a3.add('c');
		a3.add(80);
		a3.add("laila");
		a3.add("29");
		a3.add(67);
		a3.add(45.69f);
		a3.add('h');
		a3.add('o');
		a3.add('t');
		a3.add('u');
		a3.add(38.98f);
		printDiffObjects(a3);
	}
}
