package com.folksdev.spring_design_pattern.dto;

import java.math.BigDecimal;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType) {
}
