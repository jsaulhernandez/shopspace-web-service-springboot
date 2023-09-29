package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/media")
public class MediaController {
    @Autowired
    MediaService mediaService;

    @GetMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam String path) {
        return mediaService.getFile(path);
    }
}
