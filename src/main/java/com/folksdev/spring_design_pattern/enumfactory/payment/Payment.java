package com.folksdev.spring_design_pattern.enumfactory.payment;

public interface Payment {

    public String pay(String orderId, Double amount);
}
