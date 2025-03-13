import java.util.Scanner;
class Multiple3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int start = sc.nextInt();
        System.out.println("Enter the end number");
        int end = sc.nextInt();

        System.out.println("Program starts");
        while(start <= end){
            if(start % 3 == 0){
                System.out.println(start);
            }
            start ++;
        }
        System.out.println("Program ends");
    }
}