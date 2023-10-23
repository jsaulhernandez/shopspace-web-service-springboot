package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.PaymentMethodFallback;
import com.shopspace.shopspacewebservice.dto.PaymentMethodDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "payment-method", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/payment-method", fallbackFactory = PaymentMethodFallback.class)
public interface PaymentMethodClient {
    @GetMapping("/by-status")
    List<PaymentMethodDTO> getPaymentMethodsByStatus(@RequestParam Integer status);
}
