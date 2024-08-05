package org.example.springdesignpattren.payment;

public interface Payment {
    public String pay(String orderId, Double amount);
}
