package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.CategoryClient;
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
    public List<CategoryDTO> getCategoriesActive() {
        return categoryClient.getCategoriesByStatus(1);
    }
}
