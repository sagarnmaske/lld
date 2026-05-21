package paymentSystem;

public final class Payment {
    private final long amount;
    private final PaymentWay paymentWay;

    public Payment(PaymentWay paymentWay, long amount) {
        this.paymentWay = paymentWay;
        this.amount = amount;
    }

    public long getAmount() {
        return this.amount;
    }

    public PaymentWay getPaymentWay() {
        return this.paymentWay;
    }
}
