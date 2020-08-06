package com.example.model;


import java.io.Serializable;

public class Hello implements Serializable {

    private static final long serialVersionUID = 8792269337987189471L;

    private String content = "hello,world";

    public Hello() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
