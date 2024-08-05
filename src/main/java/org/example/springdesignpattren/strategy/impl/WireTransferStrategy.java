package org.example.springdesignpattren.strategy.impl;

import org.example.springdesignpattren.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("wireTransfer")
public class WireTransferStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with wire transfer for orderId " + orderId + "amount " + amount + " paymentType " + paymentType;
    }
}