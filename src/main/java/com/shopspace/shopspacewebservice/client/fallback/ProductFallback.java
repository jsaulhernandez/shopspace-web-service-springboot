package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.ProductClient;
import com.shopspace.shopspacewebservice.dto.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class ProductFallback implements FallbackFactory<ProductClient> {
    Logger logger = LoggerFactory.getLogger(ProductFallback.class);
    @Override
    public ProductClient create(Throwable cause) {
        logger.error("An exception occurred when calling the ProductClient", cause);

        return new ProductClient() {
            @Override
            public List<ProductDTO> getLastProductsWithLimit(Integer page, Integer size) {
                logger.error("[Fallback] not call getLastProductsWithLimit");
                return null;
            }
        };
    }
}