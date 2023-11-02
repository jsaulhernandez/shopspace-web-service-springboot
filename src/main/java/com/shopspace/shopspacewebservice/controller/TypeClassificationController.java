package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.TypeClassificationService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type-classification")
public class TypeClassificationController {
    @Autowired
    TypeClassificationService typeClassificationService;

    @GetMapping("/active")
    public ResponseEntity<ResponseDTO> getActiveTypesClassifications(){
        return ResponseUtil.ok(typeClassificationService.getActiveTypesClassifications());
    }
}
