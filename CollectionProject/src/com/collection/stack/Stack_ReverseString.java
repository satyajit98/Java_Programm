package com.collection.stack;

import java.util.Stack;

public class Stack_ReverseString {

	public static void reverseStringUsing(Stack<Character> c) {
		String emptyCh = " ";
		while(!c.isEmpty()) {
			emptyCh = emptyCh +c.pop();
		}
		System.out.println(emptyCh);
		
	}
	public static void main(String[] args) {
		/*Stack<Character> c = new Stack<Character>();
		c.push('j');
		c.push('a');
		c.push('v');
		c.push('a');
		reverseStringUsing(c);*/
		
		String str = "java";
		Stack<Character> stack = new Stack<>();
		
		for(char c: str.toCharArray()) {
			stack.push(c);
		}
		
		String rev = " ";
		while(!stack.empty()) {
			rev = rev + stack.pop();
		}
		
		System.out.println(rev);
	}
}
