class BankAccount
{
    double balance;
    String accountHolderName;
    long accoutnNumber;

    BankAccount(){}

    BankAccount(double balance, String accountHolderName, long accoutnNumber){
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accoutnNumber = accoutnNumber;
    }
}

class SavingAccount extends BankAccount
{
    double interest;

    SavingAccount(double balance, String accountHolderName, long accoutnNumber, double interest){
        super(balance, accountHolderName, accoutnNumber);
        this.interest = interest;

    }

    public void displayDetails(){
        System.out.println("Balance is :"+ balance);
        System.out.println("Account holder name is :"+ accountHolderName);
        System.out.println("Account number is :"+ accoutnNumber);
        System.out.println("Interest is :"+ interest);
    }
}

class BankMain
{
    public static void main(String [] args){
        SavingAccount sa = new SavingAccount(540000D, "Satyajit", 504879548L, 6.7D);
        sa.displayDetails();
    }
}