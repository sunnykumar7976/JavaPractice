package May17.Assignment;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Kavan","123456788",12000);
        BankAccount bankAccount2 = new BankAccount("Naman","987678678", 2000);

        bankAccount1.displayAccountInfo();
        System.out.println("");
        bankAccount2.displayAccountInfo();
        System.out.println("");

        bankAccount1.deposit(5000);
        bankAccount2.withdraw(5000);

        System.out.println("");

        BankAccount bankAccount3 = new BankAccount("Sid","1234321");
        bankAccount3.displayAccountInfo();



    }
}
