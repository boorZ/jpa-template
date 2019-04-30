package com.jpa.template.service.impl;

import com.jpa.template.bean.TLanguageEntity;
import com.jpa.template.bean.repository.TLanguageRepository;
import com.jpa.template.service.TLanguageService;
import common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TLanguageServiceImpl implements TLanguageService {
    @Autowired
    private TLanguageRepository tLanguageRepository;

    @Override
    public CommonRepository<TLanguageEntity, Integer> getCommonRepository() {
        return this.tLanguageRepository;
    }

}