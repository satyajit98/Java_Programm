import java.util.Scanner;
class LThreeNumber
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second value: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third value: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1+ " is the largest number");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+ " is the largest number");
        }else{
            System.out.println(num3 + " is the largest number");
        }

    }
}