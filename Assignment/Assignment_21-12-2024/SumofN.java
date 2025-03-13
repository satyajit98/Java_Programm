import java.util.Scanner;
class SumofN
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n; int i = 1; int sum = 0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        while(i<=n){
            if(i%2 == 0)
                sum -= i;
            else
                sum += i;
                i++;
        }
        System.out.println("The sum of the series is: "+ sum);
    }
}