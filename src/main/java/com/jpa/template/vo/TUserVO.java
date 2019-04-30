package com.jpa.template.vo;

import common.model.BaseEntity;

public class TUserVO extends BaseEntity{

    private String name;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public TUserVO() {
    }

    public TUserVO(String name,int sex ) {
            this.name = name;
            this.sex = sex;
    }
}