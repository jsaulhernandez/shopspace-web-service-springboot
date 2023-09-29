package com.shopspace.shopspacewebservice.service;

import org.springframework.http.ResponseEntity;

public interface MediaService {
    ResponseEntity<byte[]> getFile(String path);
}
