package June10;

public class SavingsAcc extends BankAccount {

    public SavingsAcc(double amount) {
        super();
    }

    @Override
    public double deposit(double amount) {
        balance = balance + (.10 * balance) + amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance + (.10 * balance) - amount;
        return balance;
    }
}
