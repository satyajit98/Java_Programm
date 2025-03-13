import java.util.Scanner;
class Positive
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num<1){
            System.out.println(num+ " Is negitive");
        }else{
            System.out.println(num+ " Is positive");
        }
    }
}