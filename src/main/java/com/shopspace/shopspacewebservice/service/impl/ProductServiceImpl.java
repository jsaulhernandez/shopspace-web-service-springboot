package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.ProductClient;
import com.shopspace.shopspacewebservice.config.ConstantsShopspace;
import com.shopspace.shopspacewebservice.dto.ProductDTO;
import com.shopspace.shopspacewebservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
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

    /**
     *
     * @param category id category
     * @return product list by category
     */
    @Override
    public List<ProductDTO> getProductsByCategory(Long category) {
        category = category == 0 ? null : category;
        return productClient.getProductsByCategoryWithLimit(category, 0, 8);
    }

    @Override
    public List<ProductDTO> getProductsByTypeClassification(Long idProduct, Long idTypeClassification) {
        return productClient.getProductsByTypeClassificationWithLimit(idProduct, idTypeClassification, 0, 8);
    }

    /**
     *
     * @return most selled products during the week
     */
    @Override
    public List<ProductDTO> getProductsByWeek() {
        return productClient.getProductsByWeekWithLimit(ConstantsShopspace.TOP_PRODUCTS_SALE_WEEK, 0, 6);
    }
}
