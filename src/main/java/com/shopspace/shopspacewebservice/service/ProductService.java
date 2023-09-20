package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getLastSixProducts();
}
