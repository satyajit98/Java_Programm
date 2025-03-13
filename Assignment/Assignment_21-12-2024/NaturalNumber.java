import java.util.Scanner;

class NaturalNumber
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        while(start <= n){
            sum +=start;
            System.out.println(sum);
            start ++;
        }
    }
}