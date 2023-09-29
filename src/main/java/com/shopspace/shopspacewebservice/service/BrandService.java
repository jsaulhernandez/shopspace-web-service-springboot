package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.BrandDTO;

import java.util.List;

public interface BrandService {
    List<BrandDTO> getActiveBrands();
}
