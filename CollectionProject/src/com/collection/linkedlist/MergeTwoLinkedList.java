package com.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

//WAP to merge two linkedlist.
public class MergeTwoLinkedList {

	public static LinkedList<Integer> reverseWithInbuildMethod(LinkedList<Integer> list) {
		Collections.reverse(list);
		System.out.println("After reverse using inbuild method"+ list);
		return list;
	}
	
	public static void mergeTwoLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		list1.addAll(list2);
		System.out.println("Merged LinkedList: "+list1);
	}
	public static void main(String[] args) {
		LinkedList li1 = new LinkedList();
		li1.add(45);
		li1.add(34);
		li1.add(65);
		li1.add(48);
		System.out.println("Before Reverse"+li1);
		LinkedList<Integer> li2 = reverseWithInbuildMethod(li1);
		mergeTwoLinkedList(li1, li2);
		
	}
}
