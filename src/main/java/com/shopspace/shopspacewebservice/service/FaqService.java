package com.shopspace.shopspacewebservice.service;

import com.shopspace.shopspacewebservice.dto.FaqDTO;

import java.util.List;

public interface FaqService {
    List<FaqDTO> getActiveFaqs();
}
