class Company
{
    private String companyName;
    private String companyLocation;
    private double baseSalary;

    public String getCompanyName(){
        return companyName;
    }

    public String getCompanyLocation(){
        return companyLocation;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    double calculateSalary(){
        return baseSalary;
    }

    Company(){}

    Company(String companyName, String companyLocation, double baseSalary){
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.baseSalary = baseSalary;
    }

}

class Employee extends Company
{
    String employeeName;
    int noOfHrsWorked;

    Employee(String companyName, String companyLocation, double baseSalary, String employeeName, int noOfHrsWorked){
        super(companyName, companyLocation, baseSalary);
        this.employeeName = employeeName;
        this.noOfHrsWorked = noOfHrsWorked;
    }

    @Override
    public double calculateSalary(){
        double baseSalary = super.calculateSalary();
        double perDaySalary = baseSalary / 28;
        double totalSalary = (perDaySalary/9) * noOfHrsWorked;
        return totalSalary;
    }
    public void displayDetails(){
        System.out.println("-----------------------------");
        System.out.println("Employee name is: "+employeeName);
        System.out.println("Company name is: "+getCompanyName());
        System.out.println("Company location is: "+getCompanyLocation());
        System.out.println("BaseSalary is: "+getBaseSalary());
        System.out.println("No of hours worked is: "+noOfHrsWorked);
        System.out.println("Salary is: "+calculateSalary());
    }

}

class Manager extends Company
{
    String managerName;
    double bonus;

    Manager(String companyName, String companyLocation, double baseSalary, String managerName, double bonus){
        super(companyName, companyLocation, baseSalary);
        this.managerName = managerName;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        double totalSalary = super.calculateSalary() + bonus;
        return totalSalary;
    }
    public void displayDetails(){
        System.out.println("-----------------------------");
        System.out.println("Employee name is: "+managerName);
        System.out.println("Company name is: "+getCompanyName());
        System.out.println("Company location is: "+getCompanyLocation());
        System.out.println("BaseSalary is: "+getBaseSalary());
        System.out.println("Bonus is: "+ bonus);
        System.out.println("Salary is: "+calculateSalary());
    }
}

class CompanyMain
{
    public static void main(String [] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Company company;

        System.out.println("Enter the managers details");
        System.out.print("Enter the base salary of manager: "); double baseSalaryManager = sc.nextDouble();
        System.out.print("Enter the bonus: "); double bonus = sc.nextDouble();

        company = new Manager("Infosys", "Kolkata", baseSalaryManager, "Saand", bonus);
        Manager man = (Manager)company;
        man.displayDetails();
        System.out.println("-----------------------------");

        System.out.println("Enter the employee details");
        System.out.print("Enter the base salary of employee: "); double baseSalaryEmployee = sc.nextDouble();
        System.out.print("Enter the no of hours worked: "); int noOfHrsWorked = sc.nextInt();

        company = new Employee("Wipro", "Bangalore", baseSalaryEmployee, "Satyajit", noOfHrsWorked);
        Employee emp = (Employee)company;
        emp.displayDetails();
    }
}