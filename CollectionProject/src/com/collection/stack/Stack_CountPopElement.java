package com.collection.stack;

import java.util.Stack;

public class Stack_CountPopElement {
	//WAP to count number of elements in stack. (without size())
	public static void numberOfElements(Stack<Integer> list) {
		int count = 0;
		for(int i = 0; i<list.size(); i++) {
			while(! list.empty()) {
				System.out.println("Last element of stack: "+list.peek());
				list.pop();
				count ++;
			}
		}
		System.out.println("total element remove from stack: "+count);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(25);
		stack.push(36);
		stack.push(48);
		stack.push(65);
		stack.push(500);
		
		numberOfElements(stack);
	}
}
