package com.bean;

import java.io.Serializable;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
public class Shop implements Serializable{

    public Shop(){
        super();
    }
    private String id;

    private String shopName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Shop(String id, String shopName) {
        this.id = id;
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
