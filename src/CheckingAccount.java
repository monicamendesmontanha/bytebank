public class CheckingAccount extends Account{

    public CheckingAccount(int branch, int number) {
        super(branch, number);
    }

    @Override
    public boolean withdraw(double amount) {
        double withdrawAmount = amount + 0.2;
        return super.withdraw(withdrawAmount);
    }
}
