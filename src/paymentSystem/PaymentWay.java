package paymentSystem;

public enum PaymentWay {
    CREDIT_CARD(new MakePaymentViaCreditCard()), UPI(new MakePaymentViaUpi());
    final MakePayment makePayment;

    PaymentWay(MakePayment makePayment) {
        this.makePayment = makePayment;
    }

    public MakePayment getMakePayment() {
        return this.makePayment;
    }

}
