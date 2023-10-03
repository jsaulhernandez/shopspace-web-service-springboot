package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.ProductFallback;
import com.shopspace.shopspacewebservice.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "product", value = "${shopspace-data.feign.config.name}", url = "${shopspace-data.feign.config.url}/product", fallbackFactory = ProductFallback.class)
public interface ProductClient {
    @GetMapping("/limit-data")
    List<ProductDTO> getLastProductsWithLimit(@RequestParam Integer page, @RequestParam Integer size);
    @GetMapping("/by-category")
    List<ProductDTO> getProductsByCategoryWithLimit(@RequestParam Long idCategory, @RequestParam Integer page, @RequestParam Integer size);
}
