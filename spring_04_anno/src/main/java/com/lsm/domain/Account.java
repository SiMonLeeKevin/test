package com.lsm.domain;

public class Account {
private Integer id;
private String name;
private Integer banlance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBanlance() {
        return banlance;
    }

    public void setBanlance(Integer banlance) {
        this.banlance = banlance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", banlance=" + banlance +
                '}';
    }
}
