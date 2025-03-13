package com.objectclass;

class Student
{
	String name;
	long phno;
	String gender;
	int age;
	// initialize the value
	Student(String name,long phno,String gender,int age){
		this.name = name;
		this.phno = phno;
		this.gender = gender;
		this.age = age;
	}
	// override the toString method
	@Override
	public String toString() {
		/*String s = "{"+"Name"+"="+ name+","
					+ " "+"PhoneNumber"+"="+ phno+", "+"Gender is"+"="+gender+","
					+ " "+"Age is"+"="+age+"}";*/
//		String s = "{Name ="+ name+",PhoneNumber ="+ phno+", Gender is ="+gender+ ",Age is ="+age+"}";
		String s = "{"+"Name"+"="+ name+","
				+ " "+"PhoneNumber"+"="+ phno+", "+"Gender is"+"="+gender+","
				+ " "+"Age is"+"="+age+"}";
		return s;
	}
}


public class StudentMain {
	public static void main(String[] args) {
		//Print reference
		Student s = new Student("Satyajit", 7318823412L, "male", 24);
		System.out.println(s.toString());
	}
}
