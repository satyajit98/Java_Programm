package com.satya.practice;

public class EncapsulationMain {
	public static void main(String[] args) {
		
		// Creating instance of Encapsulation method
		Encapsulation e = new Encapsulation();
		
		// access name from Encapsulation method
		System.out.println(e.getName());
		e.setName("Satyajit");
		System.out.println(e.getName());
		
		// access age from Encapsulation method
		System.out.println(e.getAge());
		e.setAge(24);
		System.out.println(e.getAge());
	}
}
