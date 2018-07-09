package com.lijingyao.microservice.coffee.template.items;

/**
 * 商品创建DTO
 * <p>
 * Created by lijingyao on 2018/7/8 22:49.
 */
public class ItemCreateDTO {


    private Integer catId;

    private String name;

    private Long price;


    private String description;


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
}
