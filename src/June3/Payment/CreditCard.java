package June3.Payment;

public class CreditCard extends Payment{
    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}
