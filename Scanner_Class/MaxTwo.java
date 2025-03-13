import java.util.Scanner;

class MaxTwo
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the max value");
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();

        double max= a>b? a : b;
        System.out.println("the maxmimum value is: "+max);

    }
}