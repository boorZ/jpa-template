package com.jpa.template.bean;

import common.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_language")
public class UserLanguageEntity extends BaseEntity{

    @Column(name = "user_id")
    private int userId;

    @Column(name = "language_id")
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

    public UserLanguageEntity() {
    }

    public UserLanguageEntity(int userId,int languageId ) {
            this.userId = userId;
            this.languageId = languageId;
    }
}