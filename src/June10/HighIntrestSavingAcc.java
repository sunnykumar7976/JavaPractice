package June10;

public class HighIntrestSavingAcc extends BankAccount {


    public HighIntrestSavingAcc(int i) {
        super();
    }

    @Override
    public double deposit(double amount) {
        balance = balance + (.2 * balance) + amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance + (.2 * balance) - amount;
        return balance;
    }

}
