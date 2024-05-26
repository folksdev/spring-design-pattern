package com.folksdev.spring_design_pattern.enumfactory.payment.impl;

import com.folksdev.spring_design_pattern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;


@Service
public class WireTransferPayment implements Payment {
    @Override
    public String pay(String orderId, Double amount) {
        return "Payment done using Wire Transfer in EnumType method";
    }
}
