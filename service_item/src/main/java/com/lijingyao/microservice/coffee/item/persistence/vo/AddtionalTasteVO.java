package com.lijingyao.microservice.coffee.item.persistence.vo;

/**
 * 每杯咖啡的附加口味。属于值对象模型。
 *
 * Created by lijingyao on 2018/7/8 22:20.
 */
public final class AddtionalTasteVO {

    // 糖分含量
    private SugarEnums sugar;

    // 牛奶含量
    private MilkEnums milk;

    // 咖啡浓度，附加
    private int espresso;

    // 咖啡因含量
    private CaffeineEnum coffeine;


    public SugarEnums getSugar() {
        return sugar;
    }

    public void setSugar(SugarEnums sugar) {
        this.sugar = sugar;
    }

    public MilkEnums getMilk() {
        return milk;
    }

    public void setMilk(MilkEnums milk) {
        this.milk = milk;
    }

    public int getEspresso() {
        return espresso;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public CaffeineEnum getCoffeine() {
        return coffeine;
    }

    public void setCoffeine(CaffeineEnum coffeine) {
        this.coffeine = coffeine;
    }
}
