package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.BrandClient;
import com.shopspace.shopspacewebservice.dto.BrandDTO;
import com.shopspace.shopspacewebservice.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandClient brandClient;

    @Override
    public List<BrandDTO> getActiveBrands() {
        return brandClient.getBrandsByStatus(1);
    }
}
