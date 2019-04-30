package com.jpa.template.controller;

import com.jpa.template.bean.TUserEntity;
import com.jpa.template.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class TUserController {
    @Autowired
    private TUserService tuserservice;

    @RequestMapping(value = "/item")
    public TUserEntity item(Integer id) {
        return tuserservice.findById(id);
    }
}