package com.jpa.template.service.impl;

import com.jpa.template.bean.TSexEntity;
import com.jpa.template.bean.repository.TSexRepository;
import com.jpa.template.service.TSexService;
import common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TSexServiceImpl implements TSexService {
    @Autowired
    private TSexRepository tSexRepository;

    @Override
    public CommonRepository<TSexEntity, Integer> getCommonRepository() {
        return this.tSexRepository;
    }

}