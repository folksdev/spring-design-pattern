package com.folksdev.spring_design_pattern.enumfactory;

import com.folksdev.spring_design_pattern.enumfactory.payment.Payment;
import com.folksdev.spring_design_pattern.enumfactory.payment.impl.CreditCardPayment;
import com.folksdev.spring_design_pattern.enumfactory.payment.impl.WireTransferPayment;

public enum PaymentEnumType {

    CREDIT_CARD("creditCard", new CreditCardPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: CREDIT_CARD");
        }
    },
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: WIRE_TRANSFER");
        }
    };

    private final String value;

    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.payment = payment;
        this.value = value;
    }

    public Payment getPayment() {
        return payment;
    }
    public String getValue() {
        return value;
    }
    public static PaymentEnumType getPaymentType(String name) {
        for (PaymentEnumType paymentType : PaymentEnumType.values()) {
            if (paymentType.getValue().equals(name)) {
                return paymentType;
            }
        }
        throw new IllegalArgumentException("Invalid payment type: " + name);
    }

    abstract public void output();

}
