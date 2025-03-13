import java.util.Scanner;
class Grade
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num == 100){
            System.out.println("The grade is: A+");
        }else if(num >= 90 && num <= 99){
            System.out.println("The grade is: A");
        }else if(num >= 80 && num <= 89){
            System.out.println("The grade is: B+");
        }else if(num >= 70 && num <= 79){
            System.out.println("The grade is: B");
        }else if(num >= 60 && num <= 69){
            System.out.println("The grade is: C");
        }else if(num >= 50 && num <= 59){
            System.out.println("The grade is: D");
        }else if(num >= 40 && num <= 49){
            System.out.println("The grade is: E");
        }else{
            System.out.println("Fail");
        }
    }
}