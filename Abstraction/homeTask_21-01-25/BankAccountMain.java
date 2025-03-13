abstract class BankAccount
{
    private double balance;

    BankAccount(){}
    BankAccount(double balance){
        this.balance = balance;
    }

    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);

    public double getBalance(){
        return balance;
    }
}
class SavingAccount extends BankAccount
{

}
class CurrentAccount extends BankAccount
{

}

class BankAccountMain
{
    public static void main(String args []){

    }
}