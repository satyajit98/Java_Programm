package com.comparable.satya;

public class Employee implements Comparable
{
	private String name;
	private long empId;
	private String designation;
	private double salary;
	private long phone;
	
	public Employee(String name, long empId, String designation, double salary, long phone) {
		this.name = name;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public long getEmpId() {
		return empId;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public long getPhone() {
		return phone;
	}
	
	@Override // sort based on empId
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.empId < e.empId) {
			return -3455;
		}else if(this.empId == e.empId) {
			return 0;
		}
		else
			return 4342;
	}
	
//	@Override // Sort based on salary
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return (int)(e.salary - this.salary);
//	}
	
//	@Override //Sort based on name
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return this.name.compareTo(e.name);
//	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", designation=" + designation + ", salary=" + salary
				+ ", phone=" + phone + "]";
	}
}
