package org.example.springdesignpattren.dto;


public record PaymentRequest(
        String orderId,

        Double amount,

        String paymentType) {

}
