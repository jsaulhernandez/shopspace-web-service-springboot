package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.SaleFallback;
import com.shopspace.shopspacewebservice.dto.CategoryDTO;
import com.shopspace.shopspacewebservice.dto.TypeClassificationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "type-classification", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/type-classification", fallbackFactory = SaleFallback.class)
public interface TypeClassificationClient {
    @GetMapping("/most-selling")
    List<TypeClassificationDTO> getMostSellingTypeClassificationWithLimit(@RequestParam Integer totalSales, @RequestParam Integer page, @RequestParam Integer size);
    @GetMapping("/available")
    Integer getTypeClassificationAvailableByProduct(@RequestParam Long idTypeClassification);
    @GetMapping("/by-status")
    List<TypeClassificationDTO> getTypesClassificationsByStatus(@RequestParam Integer status);
}
