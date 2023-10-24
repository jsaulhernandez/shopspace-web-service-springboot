package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.SaleClient;
import com.shopspace.shopspacewebservice.dto.SaleHeaderDTO;
import com.shopspace.shopspacewebservice.exception.BadRequestException;
import com.shopspace.shopspacewebservice.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleClient saleClient;

    @Override
    public boolean createSale(SaleHeaderDTO saleHeaderDTO){
        SaleHeaderDTO created = saleClient.create(saleHeaderDTO);

        if (created == null) throw new BadRequestException("The sale couldn't be made");

        return true;
    }
}
