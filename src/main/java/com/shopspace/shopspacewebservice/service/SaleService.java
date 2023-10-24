package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.SaleHeaderDTO;

public interface SaleService {
    boolean createSale(SaleHeaderDTO saleHeaderDTO);
}
