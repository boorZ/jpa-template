package com.jpa.template.controller;

import com.jpa.template.service.UserLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UserLanguageController {
     @Autowired
    private UserLanguageService userlanguageservice;

}