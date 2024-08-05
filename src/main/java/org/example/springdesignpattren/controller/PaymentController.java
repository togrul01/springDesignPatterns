package org.example.springdesignpattren.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdesignpattren.dto.PaymentRequest;
import org.example.springdesignpattren.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/payment")
public class PaymentController {
    private final PaymentFactory factory;

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(factory.executePayment(paymentRequest));
    }
}
