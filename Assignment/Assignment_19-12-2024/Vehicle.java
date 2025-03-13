import java.util.Scanner;

class Vehicle
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        int speed = sc.nextInt();
        if(speed >= 1 && speed <=30){
            System.out.println("Low Speed");
        }else if(speed >= 31 && speed <= 70){
            System.out.println("Good Speed");
        }else if(speed >= 71 && speed <= 120){
            System.out.println("Over Speed");
        }else{
            System.out.println("Go To Hell");
        }
    }
}