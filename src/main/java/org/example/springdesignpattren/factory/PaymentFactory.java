package org.example.springdesignpattren.factory;

import org.example.springdesignpattren.dto.PaymentRequest;

public interface PaymentFactory {
    String executePayment(PaymentRequest paymentRequest);
}
