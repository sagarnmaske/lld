package paymentSystem;

public class MakePaymentViaUpi implements MakePayment {
    @Override
    public void pay(long amount) {
        System.out.println(amount + " Paid via UPI");
    }
}
