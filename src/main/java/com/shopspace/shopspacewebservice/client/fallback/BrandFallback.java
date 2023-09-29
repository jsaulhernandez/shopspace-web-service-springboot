package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.BrandClient;
import com.shopspace.shopspacewebservice.dto.BrandDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class BrandFallback implements FallbackFactory<BrandClient> {
    Logger logger = LoggerFactory.getLogger(BrandFallback.class);

    @Override
    public BrandClient create(Throwable cause) {
        logger.error("An exception occurred when calling the BrandClient", cause);
        return new BrandClient() {
            @Override
            public List<BrandDTO> getBrandsByStatus(Integer status) {
                logger.error("[Fallback] not call getBrandsByStatus");
                return null;
            }
        };
    }
}
