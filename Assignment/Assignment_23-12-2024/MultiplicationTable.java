import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){ // how many tables you want to print
            for(int j =1; j<=10; j++){ // how many multiples u want to print
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("------------------------------");
        }
    }
}
