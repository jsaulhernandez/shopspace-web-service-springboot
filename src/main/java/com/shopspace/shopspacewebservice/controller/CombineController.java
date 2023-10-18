package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.BrandService;
import com.shopspace.shopspacewebservice.service.CategoryService;
import com.shopspace.shopspacewebservice.service.ProductService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/combine")
public class CombineController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    BrandService brandService;
    @Autowired
    ProductService productService;

    // Todo: return active brands and categories, also return top categories
    @GetMapping("/home")
    public ResponseEntity<ResponseDTO> getCategoriesAndBrands(){
        return ResponseUtil.ok(Map.of("activeBrands", brandService.getActiveBrands(), "topCategories", categoryService.getTopCategories(), "activeCategories", categoryService.getActiveCategories()));
    }

    // Todo: return products list that don't require filters
    @GetMapping("/home-products")
    public ResponseEntity<ResponseDTO> getHomeProducts(){
        return ResponseUtil.ok(Map.of("lastSix", productService.getLastSixProducts(), "byWeek", productService.getProductsByWeek(), "mostSelling", productService.getMostSellingProducts()));
    }
}
