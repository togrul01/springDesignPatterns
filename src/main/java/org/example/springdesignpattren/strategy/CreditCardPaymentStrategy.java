package org.example.springdesignpattren.strategy;

import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with creditCard for orderId " + orderId + "amount " + amount + " paymentType " + paymentType;
    }
}
