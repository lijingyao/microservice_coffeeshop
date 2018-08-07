package com.lijingyao.microservice.coffee.template.items;

/**
 * Created by lijingyao on 2018/7/9 10:07.
 */
public class OrderItemDetailDTO {

    private Integer itemId;

    private Long quantity;

    // 糖分
    private String sugar;

    // 牛奶含量
    private String milk;

    // 咖啡浓度，附加
    private int espresso;

    // 咖啡因含量
    private String coffeine;

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getCoffeine() {
        return coffeine;
    }

    public void setCoffeine(String coffeine) {
        this.coffeine = coffeine;
    }

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
