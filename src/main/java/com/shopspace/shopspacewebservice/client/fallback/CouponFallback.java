package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.CouponClient;
import com.shopspace.shopspacewebservice.dto.CouponDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.Optional;

public class CouponFallback implements FallbackFactory<CouponClient> {
    Logger logger = LoggerFactory.getLogger(CouponFallback.class);

    @Override
    public CouponClient create(Throwable cause) {
        logger.error("An exception occurred when calling the CouponClient", cause);
        return new CouponClient() {
            @Override
            public Optional<CouponDTO> getCouponByCode(String code) {
                logger.error("[Fallback] not call getCouponByCode");
                return Optional.empty();
            }
        };
    }
}
