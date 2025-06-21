package June10;

public class ChequingAcc extends BankAccount{
    public ChequingAcc(double balance) {
        super();
    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

}
