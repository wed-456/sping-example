package com.vip.shop;

import java.io.Serializable;

public class User implements Serializable {
    //能用包装类,就用包装类,包装类默认值为null

    private Integer uid;
    private String name;

    public User() {
    }

    public void init(){
        System.out.println("启动");
    }

    public void destory1(){
        System.out.println("没了");
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
