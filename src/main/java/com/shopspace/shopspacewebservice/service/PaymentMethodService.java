package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.PaymentMethodDTO;

import java.util.List;

public interface PaymentMethodService {
    List<PaymentMethodDTO> getActivePaymentMethods();
}
