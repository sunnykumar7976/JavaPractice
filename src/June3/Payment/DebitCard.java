package June3.Payment;

public class DebitCard extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment using Debit Card");
    }
}
