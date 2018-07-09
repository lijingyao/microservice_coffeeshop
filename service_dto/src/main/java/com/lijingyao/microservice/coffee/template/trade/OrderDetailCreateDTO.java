package com.lijingyao.microservice.coffee.template.trade;

/**
 * Created by lijingyao on 2018/7/9 09:51.
 */
public class OrderDetailCreateDTO {


    private Integer itemId;


    private Long price;

    // 重量或者是数量
    private Long quantity;


    private String itemName;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
