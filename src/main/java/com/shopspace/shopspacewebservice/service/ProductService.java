package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getLastSixProducts();

    List<ProductDTO> getProductsByCategory(Long category);

    List<ProductDTO> getProductsByTypeClassification(Long idProduct, Long idTypeClassification);

    List<ProductDTO> getProductsByWeek();
}
