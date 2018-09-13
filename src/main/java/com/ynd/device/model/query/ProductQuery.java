package com.ynd.device.model.query;

import com.ynd.device.model.base.PageQuery;

/**
 * Created by ZhuRui on 2018/2/7.
 */
public class ProductQuery extends PageQuery {


    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
