package com.folksdev.spring_design_pattern.controller;

import com.folksdev.spring_design_pattern.enumfactory.PaymentEnumType;
import com.folksdev.springdesignpattern.gen.api.PaymentApi;
import com.folksdev.springdesignpattern.gen.model.PaymentRequest;
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
