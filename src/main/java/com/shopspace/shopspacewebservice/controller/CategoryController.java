package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.CategoryService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/active")
    public ResponseEntity<ResponseDTO> getActiveCategories(){
        return ResponseUtil.ok(categoryService.getActiveCategories());
    }

    @GetMapping("/top")
    public ResponseEntity<ResponseDTO> getTopCategories(){
        return ResponseUtil.ok(categoryService.getActiveCategories());
    }
}
