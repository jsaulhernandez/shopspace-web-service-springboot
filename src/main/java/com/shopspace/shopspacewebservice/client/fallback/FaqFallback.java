package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.FaqClient;
import com.shopspace.shopspacewebservice.dto.FaqDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class FaqFallback implements FallbackFactory<FaqClient> {
    Logger logger = LoggerFactory.getLogger(FaqFallback.class);

    @Override
    public FaqClient create(Throwable cause) {
        logger.error("An exception occurred when calling the FaqClient", cause);

        return new FaqClient() {
            @Override
            public List<FaqDTO> getFaqsByStatus(Integer status) {
                logger.error("[Fallback] not call getFaqsByStatus");
                return null;
            }
        };
    }
}
