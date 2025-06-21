package June10;

public class BankAccMain {
    public static void main(String[] args) {
        double amount = 100;

        BankAccount sa = new SavingsAcc(amount);
        sa.deposit(500);
        sa.withdraw(100);
        sa.checkBalance();

        BankAccount ca = new ChequingAcc(500);
        ca.deposit(20);
        ca.withdraw(10);
        ca.checkBalance();

        BankAccount hsa = new HighIntrestSavingAcc(2500);
        hsa.deposit(500);
        hsa.withdraw(250);
        hsa.checkBalance();


    }
}
