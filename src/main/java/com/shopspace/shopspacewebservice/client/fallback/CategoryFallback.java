package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.CategoryClient;
import com.shopspace.shopspacewebservice.dto.CategoryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class CategoryFallback implements FallbackFactory<CategoryClient> {
    Logger logger = LoggerFactory.getLogger(CategoryFallback.class);

    @Override
    public CategoryClient create(Throwable cause) {
        logger.error("An exception occurred when calling the CategoryClient", cause);
        return new CategoryClient() {
            @Override
            public List<CategoryDTO> getCategoriesByStatus(Integer status) {
                logger.error("[Fallback] not call getCategoriesByStatus");
                return null;
            }

            @Override
            public List<CategoryDTO> getTopCategories(Integer total) {
                logger.error("[Fallback] not call getTopCategories");
                return null;
            }
        };
    }
}
