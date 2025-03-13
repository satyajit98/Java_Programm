package com.comparable.satya;

import java.util.Arrays;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee[] emp = { new Employee("Satyaijt", 1452877L, "Sr.Engineer", 450000D, 7318823412L),
							new Employee("Kartik", 125643L, "Test engineer", 150000D, 7485965874L),
							new Employee("Junayed", 145264L, "Test lead", 250000D, 895748526L),
							new Employee("Monkey", 254635L, "Test Manager", 175000D, 457845219L),
							new Employee("Avirup",42512L, "VP of Testing", 350000D, 879587588L),
		};
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		Arrays.sort(emp);
		
		System.out.println("-------------------------------------");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
	}
}
