package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.PaymentMethodClient;
import com.shopspace.shopspacewebservice.dto.PaymentMethodDTO;
import com.shopspace.shopspacewebservice.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
    @Autowired
    PaymentMethodClient paymentMethodClient;

    @Override
    public List<PaymentMethodDTO> getActivePaymentMethods(){
        return paymentMethodClient.getPaymentMethodsByStatus(1);
    }
}
