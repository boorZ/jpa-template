package com.jpa.template.vo;

import common.model.BaseEntity;

public class TSexVO extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TSexVO() {
    }

    public TSexVO(String name ) {
            this.name = name;
    }
}