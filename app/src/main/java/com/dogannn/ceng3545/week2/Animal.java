package com.dogannn.ceng3545.week2;

public class Animal {

    private String type;
    private int picId;

    public Animal(String type, Object o) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }
}
