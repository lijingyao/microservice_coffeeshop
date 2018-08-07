package com.lijingyao.microservice.coffee.template.trade;

/**
 * Created by lijingyao on 2018/7/9 09:51.
 */
public class OrderDetailCreateDTO {


    private Integer itemId;

    // 计算后的每个子订单价格
    private Long price;

    // 重量或者是数量
    private Long quantity;


    private String itemName;


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

    public int getEspresso() {
        return espresso;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public String getCoffeine() {
        return coffeine;
    }

    public void setCoffeine(String coffeine) {
        this.coffeine = coffeine;
    }

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
