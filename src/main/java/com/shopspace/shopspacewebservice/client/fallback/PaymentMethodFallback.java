package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.PaymentMethodClient;
import com.shopspace.shopspacewebservice.dto.PaymentMethodDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class PaymentMethodFallback implements FallbackFactory<PaymentMethodClient> {
    Logger logger = LoggerFactory.getLogger(PaymentMethodFallback.class);

    @Override
    public PaymentMethodClient create(Throwable cause) {
        logger.error("An exception occurred when calling the PaymentMethodClient", cause);
        return new PaymentMethodClient() {
            @Override
            public List<PaymentMethodDTO> getPaymentMethodsByStatus(Integer status) {
                logger.error("[Fallback] not call getPaymentMethodsByStatus");
                return null;
            }
        };
    }
}
