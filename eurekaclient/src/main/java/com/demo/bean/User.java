package com.demo.bean;

import java.io.Serializable;

/**
 * Created ${xian}
 */
public class User implements Serializable{


    private Integer id;
    private String types;
    private Integer nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}
