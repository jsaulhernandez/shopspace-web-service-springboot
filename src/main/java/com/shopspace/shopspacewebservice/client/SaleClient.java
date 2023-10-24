package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.SaleFallback;
import com.shopspace.shopspacewebservice.dto.SaleHeaderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(contextId = "sale", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/sale", fallbackFactory = SaleFallback.class)
public interface SaleClient {
    @PostMapping("/create")
    SaleHeaderDTO create(@RequestBody SaleHeaderDTO saleHeaderDTO);
}
