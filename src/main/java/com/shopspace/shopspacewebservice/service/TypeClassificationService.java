package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.TypeClassificationDTO;

import java.util.List;

public interface TypeClassificationService {
    List<TypeClassificationDTO> getMostSellingTypeClassification();
}
