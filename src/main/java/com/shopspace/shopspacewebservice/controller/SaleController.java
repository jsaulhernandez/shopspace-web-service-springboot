package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.SaleHeaderDTO;
import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.SaleService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    SaleService saleService;

    @PostMapping()
    public ResponseEntity<ResponseDTO> create(@RequestBody SaleHeaderDTO saleHeaderDTO){
        return ResponseUtil.ok(saleService.createSale(saleHeaderDTO));
    }
}
