import java.util.Scanner;

class ScannerDemo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("-------Interger type value-------");
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The result is :"+ c);*/

        System.out.println("------------String type value----------");
        System.out.println("Enter the value of a: ");
        String a = sc.nextLine();
        System.out.println("Enter the value of b: ");
        String b = sc.nextLine();

        String res = a+b;
        System.out.println("The result is :" + res);
    }
}