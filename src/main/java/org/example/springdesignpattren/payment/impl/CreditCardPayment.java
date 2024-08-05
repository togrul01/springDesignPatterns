package org.example.springdesignpattren.payment.impl;

import org.example.springdesignpattren.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements Payment{
    @Override
    public String pay(String orderId,Double amount) {
        return "Credit Card payment in EnumType method";
    }
}
