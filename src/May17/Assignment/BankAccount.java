package May17.Assignment;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    //Constructor with all fields
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        balance = 0.0;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited "+amount);
        System.out.println("New Account balance is "+balance);

    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Withdrawing "+amount);
            System.out.println("New Account balance is "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }

    }

    public void displayAccountInfo(){
        System.out.println("Account Holders : "+ accountHolderName);
        System.out.println("Account Number is : "+ accountNumber);
        System.out.println("Account Balance is : "+ balance);
    }
}
