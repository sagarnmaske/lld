package paymentSystem;

public class PaymentController {
    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(Payment payment) {
        if (payment == null) {
            System.out.println("Invalid Payment");
            return;
        }
        if (payment.getAmount() < 0) {
            System.out.println("Invalid amount");
            return;
        }
        paymentService.processPayment(payment);
    }
}
