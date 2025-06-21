package June3.Payment;

public class Paypal extends Payment{
    @Override
    public void pay() {
        System.out.println("Payment using Paypal");
    }
}
