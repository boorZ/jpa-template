package com.jpa.template.vo;

import common.model.BaseEntity;

public class TLanguageVO extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TLanguageVO() {
    }

    public TLanguageVO(String name ) {
            this.name = name;
    }
}