import java.util.Scanner;
class Person
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age <= 11){
            System.out.println("Child");
        }else if(age>= 12 && age <= 17){
            System.out.println("Teenager");
        }else if(age>= 18 && age <= 59){
            System.out.println("Adult");
        }else if (age>= 60 && age<=100){
            System.out.println("Senior citizen");
        }else
            System.out.println("You have Enterd wrong age");
    }
}