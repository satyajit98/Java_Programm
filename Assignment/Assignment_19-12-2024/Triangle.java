import java.util.Scanner;

class Triangle
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side3: ");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 ==side3 && side1 == side3){
            System.out.println("Triangle is Equilateral");
        }else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Triangle is Isosceles");
        }else{
            System.out.println("Triangle is Scalene");
        }
    }
}