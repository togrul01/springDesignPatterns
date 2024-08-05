package org.example.springdesignpattren.controller;

import org.example.springdesignpattren.enumType.PaymentEnumType;
import org.example.springdesignpattren.gen.api.PaymentApi;
import org.example.springdesignpattren.gen.model.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApiImpl implements PaymentApi {

    @Override
    public ResponseEntity<String> payment(PaymentRequest paymentRequest) {
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.getPaymentType())
                .getPayment()
                .pay(paymentRequest.getOrderId(), paymentRequest.getAmount().doubleValue()));
    }
}