package com.shopspace.shopspacewebservice.client.fallback;

import com.shopspace.shopspacewebservice.client.FirebaseStorageClient;
import feign.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

public class FirebaseStorageFallback implements FallbackFactory<FirebaseStorageClient> {
    Logger logger = LoggerFactory.getLogger(FirebaseStorageFallback.class);

    @Override
    public FirebaseStorageClient create(Throwable cause) {
        logger.error("An exception occurred when calling the StorageClient", cause);
        return new FirebaseStorageClient() {
            @Override
            public Response download(String path) {
                logger.error("[Fallback] not call download");
                return null;
            }
        };
    }
}
