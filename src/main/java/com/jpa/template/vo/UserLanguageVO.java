package com.jpa.template.vo;

import common.model.BaseEntity;

public class UserLanguageVO extends BaseEntity{

    private int userId;
    private int languageId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public UserLanguageVO() {
    }

    public UserLanguageVO(int userId,int languageId ) {
            this.userId = userId;
            this.languageId = languageId;
    }
}