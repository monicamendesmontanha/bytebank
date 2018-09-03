import staff.Customer;

public class Account {

    private double balance;
    private int branch;
    private int number;
    private Customer accountHolder;
    private static int totalAccounts = 0;

    public Account(int branch, int number){
        Account.totalAccounts++;
        System.out.println("The total of accounts is: " + Account.totalAccounts);
        this.branch = branch;
        this.number = number;
        this.balance = 100;
        System.out.println("Account created number: " + this.number);
    }


    public void deposits(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfers(double amount, Account recipient) {
        if(this.balance >= amount) {
            this.balance -= amount;
            recipient.deposits(amount);
            return true;
        }
        return false;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.number = number;
    }

    public int getBranch(){
        return this.branch;
    }

    public void setBranch(int branch){
        if(branch <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.branch = branch;
    }

    public void setAccountHolder(Customer accountHolder){
        this.accountHolder = accountHolder;
    }

    public Customer getAccountHolder(){
        return this.accountHolder;
    }

    public static int getTotalAccounts(){
        return Account.totalAccounts;
    }


}
