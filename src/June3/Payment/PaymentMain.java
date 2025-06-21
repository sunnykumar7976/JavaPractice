package June3.Payment;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay();
        Payment applepay = new ApplePay();
        applepay.pay();
        Payment debitcard = new DebitCard();
        debitcard.pay();
        Payment paypal = new Paypal();
        paypal.pay();
        Payment creditcard = new CreditCard();
        creditcard.pay();


    }
}
