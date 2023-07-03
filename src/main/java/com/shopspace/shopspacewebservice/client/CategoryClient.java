package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.dto.CategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "${shopspace.feign.config.name}", url = "${shopspace.feign.config.url}")
public interface CategoryClient {
    @GetMapping("/category/actives")
    List<CategoryDTO> getAllCategories();
}
