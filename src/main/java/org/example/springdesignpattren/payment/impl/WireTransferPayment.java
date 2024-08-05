package org.example.springdesignpattren.payment.impl;

import org.example.springdesignpattren.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class WireTransferPayment implements Payment {

    @Override
    public String pay(String orderId,Double amount) {
        return "Payment done by Wire Transfer for order id: " + orderId  + " and amount: " + amount;
    }
}
