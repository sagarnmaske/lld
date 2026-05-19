import paymentSystem.PaymentController;
import paymentSystem.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentController paymentController = new PaymentController(new PaymentService());
        paymentController.processPayment(500);
        paymentController.processPayment(-10);
        paymentController.processPayment(1000);
    }
}