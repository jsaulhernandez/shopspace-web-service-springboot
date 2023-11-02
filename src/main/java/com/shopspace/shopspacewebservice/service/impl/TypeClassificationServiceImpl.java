package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.TypeClassificationClient;
import com.shopspace.shopspacewebservice.config.ConstantsShopspace;
import com.shopspace.shopspacewebservice.dto.TypeClassificationDTO;
import com.shopspace.shopspacewebservice.service.TypeClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeClassificationServiceImpl implements TypeClassificationService {
    @Autowired
    TypeClassificationClient typeClassificationClient;

    /**
     *
     * @return most selling type classification
     */
    @Override
    public List<TypeClassificationDTO> getMostSellingTypeClassification() {
        List<TypeClassificationDTO> data = typeClassificationClient.getMostSellingTypeClassificationWithLimit(ConstantsShopspace.TOP_TYPE_CLASSIFICATION_SALE, 0, 6);

         data = data.stream().peek(tc -> {
            tc.setClassificationCategories(null);
            tc.setAvailable(typeClassificationClient.getTypeClassificationAvailableByProduct(tc.getId()));
        }).toList();

        return data;
    }
}
