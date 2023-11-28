package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.FaqFallback;
import com.shopspace.shopspacewebservice.dto.FaqDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "faq", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/faq", fallbackFactory = FaqFallback.class)
public interface FaqClient {
    @GetMapping("/by-status")
    List<FaqDTO> getFaqsByStatus(@RequestParam Integer status);
}
