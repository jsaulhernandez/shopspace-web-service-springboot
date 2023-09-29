package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.FirebaseStorageClient;
import com.shopspace.shopspacewebservice.exception.ResourceNotFoundException;
import com.shopspace.shopspacewebservice.service.MediaService;
import com.shopspace.shopspacewebservice.util.ShopspaceUtil;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MediaServiceImpl implements MediaService {
    @Autowired
    FirebaseStorageClient storageClient;
    @Override
    public ResponseEntity<byte[]> getFile(String path){
        byte[] content;
        Response response = storageClient.download(path);
        Response.Body body = response.body();

        try {
            content = body.asInputStream().readAllBytes();
            String contentAsString = new String(content);

            if (contentAsString.contentEquals("ResourceNotFoundException"))
                throw new ResourceNotFoundException("The file doesn't exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>(content, ShopspaceUtil.getHeaders(response.headers()), HttpStatus.OK);
    }
}
