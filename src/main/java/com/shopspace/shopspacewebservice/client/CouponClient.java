package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.CouponFallback;
import com.shopspace.shopspacewebservice.dto.CouponDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(contextId = "coupon", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/coupon", fallbackFactory = CouponFallback.class)
public interface CouponClient {
    @GetMapping("/code/{code}")
    Optional<CouponDTO> getCouponByCode(@PathVariable("code") String code);
}
