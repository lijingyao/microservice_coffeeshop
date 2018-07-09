package com.lijingyao.microservice.coffee.item.persistence.entity;

import com.lijingyao.microservice.coffee.base.durid.entity.UtcTimeIntIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

/**
 * Created by lijingyao on 2018/7/8 21:53.
 */
@Entity
@Table(name = "item_info")
public class ItemInfo extends UtcTimeIntIdEntity {


    @NotNull
    @Column(name = "cat_id")
    private Integer catId;

    @NotNull
    private String name;

    @NotNull
    private Long price;



    @Column(name = "description", length = 256)
    private String description;

    @Version
    @Column(name = "opt_lock")
    private Integer version = 0;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
