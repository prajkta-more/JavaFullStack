package Tyif;
public class BankingApplication 
{
    public static void main(String[] args) 
    {
        BankAccount_UserOperation myAccount = new BankAccount_UserOperation(1000);
        Runnable depositTask = () -> myAccount.deposit(500);
        Runnable withdrawTask = () -> myAccount.withdraw(700);
        Runnable balanceTask = () -> myAccount.checkBalance();
        Thread t1 = new Thread(depositTask, "DepositThread");
        Thread t2 = new Thread(withdrawTask, "WithdrawThread");
        Thread t3 = new Thread(balanceTask, "BalanceThread");

        t1.start();
        t2.start();
        t3.start();
    }
}
class BankAccount_UserOperation
{
    private double balance;

    public BankAccount_UserOperation(double initbalance) 
    {
        this.balance = initbalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " Depositing " + amount);
        this.balance += amount;
        System.out.println("Updated balance after Deposit : " + this.balance);
    }

    public synchronized void withdraw(double amount) 
    {
        if (amount > this.balance)
        {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance... transaction failed");
        }
        else 
        {
            System.out.println(Thread.currentThread().getName() + " Withdrawing Amount " + amount);
            this.balance -= amount;
            System.out.println("Updated balance after Withdraw : " + this.balance);
        }
    }

    public synchronized void checkBalance()
    {
        System.out.println(Thread.currentThread().getName() + " Checking balance : " + this.balance);
    }
}
