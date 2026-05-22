import notificationSystem.NotificationController;
import notificationSystem.UserService;
import paymentSystem.Payment;
import paymentSystem.PaymentController;
import paymentSystem.PaymentService;
import paymentSystem.PaymentWay;

public class Main {
    public static void main(String[] args) {
//        PaymentController paymentController = new PaymentController(new PaymentService());
//        paymentController.processPayment(new Payment(PaymentWay.UPI,1000));
//        paymentController.processPayment(new Payment(PaymentWay.CREDIT_CARD,2000));
//        paymentController.processPayment(new Payment(PaymentWay.UPI,-100));

        NotificationController notificationController = new NotificationController(new UserService());
        notificationController.getNotification("I have new offer for you");
    }
}