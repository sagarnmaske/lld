package paymentSystem;

public class PaymentService {
    public void processPayment(double amount) {
        MakePayment makePayment = new MakePaymentViaUpi();
        makePayment.pay(amount);
    }
}
