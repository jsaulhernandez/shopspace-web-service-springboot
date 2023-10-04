package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.ProductService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/last-six")
    public ResponseEntity<ResponseDTO> getLastSixProducts(){
        return ResponseUtil.ok(productService.getLastSixProducts());
    }

    @GetMapping("/by-category/{category}")
    public ResponseEntity<ResponseDTO> getProductsByCategory(@PathVariable Long category){
        return ResponseUtil.ok(productService.getProductsByCategory(category));
    }

    @GetMapping("/by-type-classification")
    public ResponseEntity<ResponseDTO> getProductsByTypeClassification(@RequestParam Long idProduct, @RequestParam Long idTypeClassification){
        return ResponseUtil.ok(productService.getProductsByTypeClassification(idProduct, idTypeClassification));
    }
}
