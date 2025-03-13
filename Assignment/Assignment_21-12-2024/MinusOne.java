import java.util.Scanner;
class MinusOne
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if(number == -1){
                break;
            }
            sum += number;
            count ++;
        }
        int average = sum/count;
        System.out.println("Sum of entered numbers: "+ sum);
        System.out.println("Average: "+ average);
    }
}