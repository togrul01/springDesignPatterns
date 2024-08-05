package org.example.springdesignpattren.strategy;

public interface PaymentStrategy {
    String pay(String orderId, Double amount, String paymentType);
}
