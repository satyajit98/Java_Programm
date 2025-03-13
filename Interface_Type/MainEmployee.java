interface Person
{
    int getAge();
    String getName();
}

interface Payable
{
    double calculateSalary();
    double processPayment();
}

class Employee implements Payable, Person
{
    private String name;
    private int age;
    private double perHrAmount;
    private int noOfHrWorked;

    Employee(String name, int age, double perHrAmount, int noOfHrWorked){
        this.name = name;
        this.age = age;
        this.perHrAmount = perHrAmount;
        this.noOfHrWorked = noOfHrWorked;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getAge(){
        return age;
    }

    public double getperHrAmount(){
        return perHrAmount;
    }
    public int getnoOfHrWorked(){
        return noOfHrWorked;
    }

    @Override
    public double calculateSalary(){
        double totalSal = getperHrAmount()*getnoOfHrWorked();
        return totalSal;
    }

    @Override
    public double processPayment(){
        System.out.println("------------------------------------------");
        System.out.println("Printing Employees Details");
        System.out.println("------------------------------------------");
        System.out.println("Employee name is: "+getName());
        System.out.println("Employee age is: "+getAge());
        System.out.println("Amount is for Per Hour: "+getperHrAmount());
        System.out.println("Hours no of Worked: "+getnoOfHrWorked());
        System.out.println("Total Salary is : "+calculateSalary());
        System.out.println("------------------------------------------");
        return calculateSalary();
    }

}

class MainEmployee
{
    public static void main(String [] args){
        Employee e = new Employee("Satya", 24, 242, 1500);
        e.processPayment();
        Employee e1 = new Employee("Kartik", 26, 145, 1350);
        e1.processPayment();

    }
}