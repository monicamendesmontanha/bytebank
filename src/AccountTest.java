public class AccountTest {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(111, 111);
        checkingAccount.deposits(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.deposits(200.);

        checkingAccount.transfers(10.0, savingsAccount);


        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

    }
}
