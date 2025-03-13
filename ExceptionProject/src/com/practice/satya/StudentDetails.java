package com.practice.satya;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student{
	private String name;
	private char gender;
	private double marks;
	
	public Student(String name, char gender, double marks) {
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public double getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "Student [name = " + name + ", Gender = "+ gender + ", Marks= "+ marks+"]";
	}
}
class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			System.out.println("Enter the gender: ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter the marks");
			double marks = sc.nextDouble();
			System.out.println("Enter the index you want to print: ");
			int n = sc.nextInt();
			try {
				Student s1 = new Student(name,gender, marks);
				System.out.println(s1);
				System.out.println(s1.getName().charAt(n));
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("String index out of bound exception: "+e);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
	}
	
}
