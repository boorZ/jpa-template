package com.jpa.template.service.impl;

import com.jpa.template.bean.TUserEntity;
import com.jpa.template.bean.repository.TUserRepository;
import com.jpa.template.service.TUserService;
import common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserRepository tUserRepository;

    @Override
    public CommonRepository<TUserEntity, Integer> getCommonRepository() {
        return this.tUserRepository;
    }

}