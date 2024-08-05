package org.example.springdesignpattren.factory.imp;

import lombok.RequiredArgsConstructor;
import org.example.springdesignpattren.dto.PaymentRequest;
import org.example.springdesignpattren.enumType.PaymentEnumType;
import org.example.springdesignpattren.factory.PaymentFactory;
import org.example.springdesignpattren.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PaymentFactoryImpl implements PaymentFactory {
    private final Map<String, PaymentStrategy> strategies;

    public PaymentStrategy getPaymentStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = strategies.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid payment paymentType" + paymentType);
        }
        return paymentStrategy;
    }

    @Override
    public String executePayment(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentRequest.paymentType());
        return paymentStrategy.pay(paymentRequest.orderId(), paymentRequest.amount(), paymentRequest.paymentType());

    }
}
