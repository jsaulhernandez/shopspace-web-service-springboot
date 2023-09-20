package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.ProductClient;
import com.shopspace.shopspacewebservice.dto.ProductDTO;
import com.shopspace.shopspacewebservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    ProductClient productClient;

    /**
     *
     * @return list with six items
     */
    @Override
    public List<ProductDTO> getLastSixProducts() {
        return productClient.getLastProductsWithLimit(0, 6);
    }
}
