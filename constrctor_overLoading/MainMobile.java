class Mobile
{
	String name;
	String designation;
	double salary;
	int empid;
	
	public void DispMobile()
	{
		System.out.println("Name is: "+name);
		System.out.println("Designation is : "+designation);
		System.out.println("Salary is : " + salary);
		System.out.println("EmpID is : "+ empid);
		System.out.println("--------------------");
	}

	Mobile()
	{
	
	}
	Mobile(String name)
	{
		this.name = name;
	}
	Mobile(String name, String designation)
	{
		this(name);
		this.designation = designation;
	}
	Mobile(String name, String designation, double salary)
	{
		this(name, designation);
		this.salary = salary;
	}
	Mobile(String name, String designation, double salary, int empid)
	{
		this(name, designation, salary);
		this.empid = empid; 
	}
	
}

class MainMobile
{
	public static void main(String [] args)
	{
		Mobile e1 = new Mobile();
		Mobile e2 = new Mobile("satya");
		Mobile e3 = new Mobile("Satyajit", "Software Engineer");
		Mobile e4 = new Mobile("Satyajit", "Software Engineer", 150000D);
		Mobile e5 = new Mobile("Satyajit", "Software Engineer", 150000D, 1145);

		e1.DispMobile();
		e2.DispMobile();
		e3.DispMobile();
		e4.DispMobile();
		e5.DispMobile();
	}
}