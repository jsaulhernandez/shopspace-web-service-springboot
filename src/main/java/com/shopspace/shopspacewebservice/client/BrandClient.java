package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.BrandFallback;
import com.shopspace.shopspacewebservice.dto.BrandDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "brand", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/brand", fallbackFactory = BrandFallback.class)
public interface BrandClient {
    @GetMapping("/by-status")
    List<BrandDTO> getBrandsByStatus(@RequestParam Integer status);
}
