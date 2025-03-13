import java.util.Scanner;

class Operation
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the Second Number:");
        double num2 = sc.nextDouble();

        switch(operator){
            case '+':
                double result = num1 + num2;
                System.out.println("result: "+ result); break;

            case '-':
                result = num1 - num2;
                System.out.println("result: "+ result); break;

            case '*':
                result = num1 * num2;
                System.out.println("result: "+ result); break;

            case '/':
                result = num1 / num2;
                System.out.println("result: "+ result); break;

            case '%':
                result = num1 % num2;
                System.out.println("result: "+ result); break;

            default : System.out.println("wrong input");
        }
    }
}