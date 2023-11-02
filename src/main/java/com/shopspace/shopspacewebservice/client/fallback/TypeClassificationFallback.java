package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.TypeClassificationClient;
import com.shopspace.shopspacewebservice.dto.TypeClassificationDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class TypeClassificationFallback implements FallbackFactory<TypeClassificationClient> {
    Logger logger = LoggerFactory.getLogger(TypeClassificationFallback.class);

    @Override
    public TypeClassificationClient create(Throwable cause) {
        logger.error("An exception occurred when calling the TypeClassificationClient", cause);
        return new TypeClassificationClient() {
            @Override
            public List<TypeClassificationDTO> getMostSellingTypeClassificationWithLimit(Integer totalSales, Integer page, Integer size) {
                logger.error("[Fallback] not call getMostSellingTypeClassificationWithLimit");
                return null;
            }

            @Override
            public Integer getTypeClassificationAvailableByProduct(Long idTypeClassification) {
                logger.error("[Fallback] not call getTypeClassificationAvailableByProduct");
                return null;
            }
        };
    }
}
