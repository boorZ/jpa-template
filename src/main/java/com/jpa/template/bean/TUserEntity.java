package com.jpa.template.bean;

import common.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_user")
public class TUserEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "sex")
    private TSexEntity sex;

    @ManyToMany
    @JoinTable(
        name="user_language",
        joinColumns=@JoinColumn(name="user_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="language_id", referencedColumnName="id"))
    private List<TLanguageEntity> languageList;

    public List<TLanguageEntity> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<TLanguageEntity> languageList) {
        this.languageList = languageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TSexEntity getSex() {
        return sex;
    }

    public void setSex(TSexEntity sex) {
        this.sex = sex;
    }
}