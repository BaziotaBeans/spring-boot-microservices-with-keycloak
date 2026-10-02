package com.beans.ecommerce.kafka;

import com.beans.ecommerce.customer.CustomerResponse;
import com.beans.ecommerce.order.PaymentMethod;
import com.beans.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products) {

}
