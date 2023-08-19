package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.CategoryClient;
import com.shopspace.shopspacewebservice.config.ConstantsShopspace;
import com.shopspace.shopspacewebservice.dto.CategoryDTO;
import com.shopspace.shopspacewebservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryClient categoryClient;

    @Override
    public List<CategoryDTO> getActiveCategories() {
        return categoryClient.getCategoriesByStatus(1);
    }

    @Override
    public List<CategoryDTO> getTopCategories() {
        return categoryClient.getTopCategories(ConstantsShopspace.TOP_PARENT_CATEGORIES_SALE);
    }
}
