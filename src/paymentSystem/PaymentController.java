package paymentSystem;

public class PaymentController {
    PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processPayment(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        paymentService.processPayment(amount);
    }
}
