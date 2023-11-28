package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.FaqClient;
import com.shopspace.shopspacewebservice.dto.FaqDTO;
import com.shopspace.shopspacewebservice.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService {
    @Autowired
    FaqClient faqClient;

    @Override
    public List<FaqDTO> getActiveFaqs() {
        return faqClient.getFaqsByStatus(1);
    }
}
