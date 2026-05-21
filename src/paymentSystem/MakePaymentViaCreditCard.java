package paymentSystem;

public class MakePaymentViaCreditCard implements MakePayment {
    @Override
    public void pay(long amount) {
        System.out.println(amount + " Paid via CreditCard");
    }
}
