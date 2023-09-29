package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.BrandService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandService brandService;

    @GetMapping("/active")
    public ResponseEntity<ResponseDTO> getActiveBrands(){
        return ResponseUtil.ok(brandService.getActiveBrands());
    }
}
