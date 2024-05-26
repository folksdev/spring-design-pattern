package com.folksdev.spring_design_pattern.strategy;

public interface PaymentStrategy {

    String pay(String orderId, Double amount, String paymentType);
}
