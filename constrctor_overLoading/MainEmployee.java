class Employee
{
	String name;
	String designation;
	double salary;
	int empid;
	
	public void DispEmployee()
	{
		System.out.println("Name is: "+name);
		System.out.println("Designation is : "+designation);
		System.out.println("Salary is : " + salary);
		System.out.println("EmpID is : "+ empid);
		System.out.println("--------------------");
	}

	Employee()
	{
	
	}
	Employee(String name)
	{
		this.name = name;
	}
	Employee(String name, String designation)
	{
		this(name);
		this.designation = designation;
	}
	Employee(String name, String designation, double salary)
	{
		this(name, designation);
		this.salary = salary;
	}
	Employee(String name, String designation, double salary, int empid)
	{
		this(name, designation, salary);
		this.empid = empid; 
	}
	
}

class MainEmployee
{
	public static void main(String [] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee("satya");
		Employee e3 = new Employee("Satyajit", "Software Engineer");
		Employee e4 = new Employee("Satyajit", "Software Engineer", 150000D);
		Employee e5 = new Employee("Satyajit", "Software Engineer", 150000D, 1145);

		e1.DispEmployee();
		e2.DispEmployee();
		e3.DispEmployee();
		e4.DispEmployee();
		e5.DispEmployee();
	}
}