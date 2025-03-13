import java.util.Scanner;

class Bank
{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    Bank(){}

    Bank(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public long getaccoutnNumber(){
        return accountNumber;
    }

    public String getaccountHolderName(){
        return accountHolderName;
    }

    public void setaccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double getbalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0 && amount % 100 == 0){
            balance = balance + amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            if(amount>0 && amount % 100==0){
                balance = balance - amount;
            }else{
                System.out.println("Invalid amount");
            }
        }else{
            System.out.println("Insufficient balance");
        }
    }
}

class BankMain
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Bank b1 = new Bank(50487859847L, "satya", 0000D);

        boolean exit = false;

        while(!exit){

        System.out.println("\n1.Balance View\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
        System.out.println("Choose Your Option");
        int num = sc.nextInt();

            switch(num)
            {
                case 1:
                    System.out.println("Your Balance is: "+b1.getbalance()); break;
                case 2:
                    System.out.println("Enter balance how much money do you want to deposit: ");
                    double depositMoney = sc.nextDouble();
                    b1.deposit(depositMoney);
                    System.out.println("Your Balance is: "+b1.getbalance()); break;
                case 3:
                    System.out.println("Enter balance how much money do you want to withdraw: ");
                    double withdrawMoney = sc.nextDouble();
                    b1.withdraw(withdrawMoney);
                    System.out.println("After withdraw your balance is: "+b1.getbalance()); break;
                case 4:
                    exit = true;
                    System.out.println("Good Bye! Have a nice day"); break;
                default : System.out.println("Wrong Input");
            }
        }
        
    }
}