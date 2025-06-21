package June10;

public abstract class BankAccount {

    String accountNum;
    double balance;

    public BankAccount() {
    }


    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);

    public void checkBalance(){
        System.out.println("Your Account Balance is : $"+ balance);
    }

}
