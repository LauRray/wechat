package com.feihu.first.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;

    private String premistion;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPremistion() {
        return premistion;
    }

    public void setPremistion(String premistion) {
        this.premistion = premistion == null ? null : premistion.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}