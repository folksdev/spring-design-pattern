package com.folksdev.spring_design_pattern.controller;


import com.folksdev.spring_design_pattern.dto.PaymentRequest;
import com.folksdev.spring_design_pattern.enumfactory.PaymentEnumType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumController {


    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.paymentType())
                .getPayment()
                .pay(paymentRequest.orderId(), paymentRequest.amount()));
    }
}
