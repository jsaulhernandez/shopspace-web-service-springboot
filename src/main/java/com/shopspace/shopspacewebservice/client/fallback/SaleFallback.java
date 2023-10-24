package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.SaleClient;
import com.shopspace.shopspacewebservice.dto.SaleHeaderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

public class SaleFallback implements FallbackFactory<SaleClient> {
    Logger logger = LoggerFactory.getLogger(SaleFallback.class);

    @Override
    public SaleClient create(Throwable cause) {
        logger.error("An exception occurred when calling the SaleClient", cause);

        return new SaleClient() {
            @Override
            public SaleHeaderDTO create(SaleHeaderDTO saleHeaderDTO) {
                logger.error("[Fallback] not call create");
                return null;
            }
        };
    }
}
