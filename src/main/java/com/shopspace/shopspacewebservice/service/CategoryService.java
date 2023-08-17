package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getActiveCategories();
}
