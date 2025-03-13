import java.util.Scanner;

class Menu
{
    public static void main(String [] args){
        double price = 5000;
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Balance View\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
        System.out.println("Choose Your Option");
        int num = sc.nextInt();
        
            switch(num){
            case 1 :
                System.out.println("Your Balance is: "+ price); break;
            case 2:
                System.out.println("Enter your amount how much money do you want to deposite: ");
                double enterPrice = sc.nextDouble();
                double currentPrice = price + enterPrice;
                System.out.println("your total money is: "+ currentPrice); break;
            case 3:
                System.out.println("Enter your amount how much money do you want to withdraw: ");
                double withdrawPrice = sc.nextDouble();
                double currentWithdrawPrice = price - withdrawPrice;
                System.out.println("Withdraw money is: "+ currentWithdrawPrice); break;
            case 4: 
                exit = false;
                System.out.println("Thank You"); break;
            default : System.out.println("Wrong Input");
        }
        
        
    }
}