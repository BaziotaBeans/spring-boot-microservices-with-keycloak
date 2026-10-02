package com.beans.ecommerce.payment;

import com.beans.ecommerce.customer.CustomerResponse;
import com.beans.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
