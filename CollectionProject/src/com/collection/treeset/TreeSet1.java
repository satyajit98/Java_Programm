package com.collection.treeset;

import java.util.TreeSet;

public class TreeSet1 {
	public static void classCustException1(TreeSet ts) {
		System.out.println(ts);
	}
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(4);
		try {
			ts.add("Satyajit");			
		}catch(ClassCastException e) {
			System.out.println("Exception handled"+e);
		}
		try {
			ts.add(null);			
		}catch(NullPointerException e) {
			System.out.println("Exception handled"+e);
			
		}
		ts.add(65);
		ts.add(100);
		classCustException1(ts);
		System.out.println('a');
	}
}
