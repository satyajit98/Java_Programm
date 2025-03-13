package com.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class CheckPalindrome {
	
//	public static LinkedList<Integer> reverseWithInbuildMethod(LinkedList<Integer> list) {
//		Collections.reverse(list);
//		System.out.println("After reverse using inbuild method"+ list);
//		return list;
//	}
	public static boolean checkPalindrome(LinkedList<Integer> list) {
		int start = 0;
		int end = list.size()-1;
		while(start<end) {
			if(!list.get(start).equals(list.get(end))) {
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(45);
		li.add(34);
		li.add(100);
		li.add(34);
		li.add(54);
//		System.out.println("Before Reverse"+li);
//		LinkedList<Integer> li2 = reverseWithInbuildMethod(li);
		
		System.out.println(checkPalindrome(li));
	}}
