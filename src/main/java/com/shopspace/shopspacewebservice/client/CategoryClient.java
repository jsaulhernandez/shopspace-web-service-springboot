package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.CategoryFallback;
import com.shopspace.shopspacewebservice.dto.CategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(contextId = "category", value = "${shopspace.feign.config.name}", url = "${shopspace.feign.config.url}/category", fallbackFactory = CategoryFallback.class)
public interface CategoryClient {
    @GetMapping("/by-status")
    List<CategoryDTO> getCategoriesByStatus(@RequestParam Integer status);
    @GetMapping("/top")
    List<CategoryDTO> getTopCategories(@RequestParam Integer total);
}
