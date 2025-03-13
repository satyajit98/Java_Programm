package com.collection.stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(600);
		stack.push(200);
		
		System.out.println(stack);
		System.out.println("Poped element is : "+stack.pop());
		System.out.println(stack);
		System.out.println("Top element is: "+stack.peek());
		System.out.println("To check stack is empty or not : "+stack.empty());
	}
}
