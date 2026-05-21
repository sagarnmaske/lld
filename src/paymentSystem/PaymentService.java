package paymentSystem;

public class PaymentService {

    public void processPayment(Payment payment) {
        MakePayment makePayment = payment.getPaymentWay().getMakePayment();
        makePayment.pay(payment.getAmount());
    }
}
