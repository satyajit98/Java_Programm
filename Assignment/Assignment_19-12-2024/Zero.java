import java.util.Scanner;
class Zero
{
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    if(num >= 1){
        System.out.println("Positive");
    }else if(num < 0){
        System.out.println("Negitive");
    }else if(num == 0){
        System.out.println("Zero");
    }
}
}