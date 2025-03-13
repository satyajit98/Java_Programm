class Employee
{
    private String name;
    private int id;
    private double salary;

    Employee(){}
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public void work(){
        System.out.println("He can work");
        System.out.println("---------------------");
    }
}

class Manager extends Employee
{
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void assignTask(){
        System.out.println("Task assign completed");
        System.out.println("---------------------");
    }

    public void displayEmpDetails(){
        System.out.println("Employee properties");
        System.out.println("---------------------");
        System.out.println("Name is : "+ getName());
        System.out.println("Id is : "+ getId());
        System.out.println("Salary is : "+ getSalary());
        System.out.println("Team size is : "+ teamSize);
    }

}

class EmployeeMain
{
    public static void main(String args []){
        Manager m = new Manager("Sagar", 105, 90000D, 4);
        m.displayEmpDetails();
        m.work();
        m.assignTask();
    }
}