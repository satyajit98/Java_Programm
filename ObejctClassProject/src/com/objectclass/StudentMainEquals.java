package com.objectclass;

class Student1
{
	String name;
	int rollno;
	int age;
	double marks;

	public Student1(String name, int rollno, int age, double marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		String s = "[Name : "+name+" Rollno : "+rollno+" Age : "+age+" Marks : "+marks+"]";
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		Student1 s = (Student1)o;
		return this.name.equals(s.name) && this.rollno == s.rollno
				&& this.age == s.age && this.marks == marks;
	}
	
	@Override
	public int hashCode() {
		int hc = name.hashCode()+rollno+age+(int)marks;
		return hc;
	}
	
}

public class StudentMainEquals {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Satyajit", 114, 23, 321D);
		Student1 s2 = new Student1("Chotu", 245, 26, 650D);
		Student1 s3 = new Student1("Satyajit", 114, 23, 321D);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // false
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s2.equals(s3)); // false
		
		//
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.hashCode()==s2.hashCode()); // false
		System.out.println(s1.hashCode() == s3.hashCode()); // true
		System.out.println(s2.hashCode()==s3.hashCode()); // false

	}

}
