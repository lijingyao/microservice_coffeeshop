package com.lijingyao.microservice.coffee.template.items;

/**
 * Created by lijingyao on 2018/7/9 10:07.
 */
public class OrderItemDetailDTO {

    private Integer itemId;

    private Long quantity;

    // 咖啡浓度，附加
    private int espresso;


    public int getEspresso() {
        return espresso;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
