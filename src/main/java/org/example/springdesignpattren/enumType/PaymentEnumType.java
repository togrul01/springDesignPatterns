package org.example.springdesignpattren.enumType;

import org.example.springdesignpattren.payment.Payment;
import org.example.springdesignpattren.payment.impl.CreditCardPayment;
import org.example.springdesignpattren.payment.impl.WireTransferPayment;

public enum PaymentEnumType {

    CREDIT_CARD("creditCard", new CreditCardPayment()),
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment());

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.payment = payment;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Payment getPayment() {
        return payment;
    }

    public static PaymentEnumType getPaymentType(String name) {
        for (PaymentEnumType paymentType : PaymentEnumType.values()) {
            if (paymentType.getValue().equals(name)) {
                return paymentType;
            }
        }
        throw new IllegalArgumentException("Invalid payment type: " + name);
    }
}
