import java.util.Scanner;

class Calculator
{
    public static void add(int num1, int num2){
        System.out.println("The addition of two number is: "+(num1 + num2));
    }
    public static void add(int num1, int num2, int num3){
        System.out.println("The addition of three number is: "+(num1+num2+num2));
    }
    public static void sub(int num1, int num2){
        System.out.println("The Subtraction of two number is: "+(num1-num2));
    }
    public static void mul(int num1, int num2){
        System.out.println("The Multiplication of two number is: "+(num1*num2));
    }
    public static void mul(int num1, int num2, int num3){
        System.out.println("The Multiplication of three number is: "+(num1*num2*num3));
    }
    public static void div(int num1, int num2){
        System.out.println("The Division of two number is: "+(num1/num2));
    }
}
class Calculator_overLoading
{
    public static void main(String [] args)
    {
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        while(flag)
        {
        System.out.println("Enter the number how many parameter you want only (2 or 3): ");
        int operand = sc.nextInt();

        if(operand == 2 || operand == 3)
        {
            System.out.println("Enter the Option: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
            int option = sc.nextInt();
                switch(option)
                {
                    case 1: if(operand == 2){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        Calculator.add(num1, num2);
                    }else if(operand == 3){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        System.out.println("Enter the third number: ");
                        int num3 = sc.nextInt();
                        Calculator.add(num1, num2, num3);
                    }else{
                        System.out.println("Wrong input");
                    } break;

                    case 2: if(operand == 2){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        Calculator.sub(num1, num2);
                    }else if(operand == 3){
                        System.out.println("Not possible");
                    }else{
                        System.out.println("Wrong input");
                    } break;

                    case 3: if(operand == 2){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        Calculator.mul(num1, num2);
                    }else if(operand == 3){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        System.out.println("Enter the third number: ");
                        int num3 = sc.nextInt();
                        Calculator.mul(num1, num2, num3);
                    }else{
                        System.out.println("Wrong input");
                    } break;

                    case 4: if(operand == 2){
                        System.out.println("Enter the first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the second number: ");
                        int num2 = sc.nextInt();
                        Calculator.div(num1, num2);
                    }else if(operand == 3){
                        System.out.println("Not possible");
                    }else{
                        System.out.println("Wrong input");
                    } break;
                    case 5: flag = false;
                        System.out.println("Have a nice day!"); break;

                    default : System.out.println("Wrong input");
                }

            }
            else
            {
                System.out.println("Wrong input You have to enter 2 or 3, try again.");
            }
        }
        
    }
}