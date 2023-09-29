package com.shopspace.shopspacewebservice.client;

import com.shopspace.shopspacewebservice.client.fallback.FirebaseStorageFallback;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "storage", value = "${shopspace-storage.feign.config.name}", url = "${shopspace-storage.feign.config.url}/file", fallbackFactory = FirebaseStorageFallback.class)
public interface FirebaseStorageClient {
    @GetMapping("/download")
    Response download(@RequestParam String path);
}
