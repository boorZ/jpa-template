package com.jpa.template.bean;

import common.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_language")
public class TLanguageEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TLanguageEntity() {
    }

    public TLanguageEntity(String name ) {
            this.name = name;
    }
}