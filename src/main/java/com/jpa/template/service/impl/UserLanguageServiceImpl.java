package com.jpa.template.service.impl;

import com.jpa.template.bean.UserLanguageEntity;
import com.jpa.template.bean.repository.UserLanguageRepository;
import com.jpa.template.service.UserLanguageService;
import common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLanguageServiceImpl implements UserLanguageService {
    @Autowired
    private UserLanguageRepository userLanguageRepository;

    @Override
    public CommonRepository<UserLanguageEntity, Integer> getCommonRepository() {
        return this.userLanguageRepository;
    }

}