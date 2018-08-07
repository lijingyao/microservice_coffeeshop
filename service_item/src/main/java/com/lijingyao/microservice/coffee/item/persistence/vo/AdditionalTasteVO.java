package com.lijingyao.microservice.coffee.item.persistence.vo;

import org.apache.commons.lang3.StringUtils;

/**
 * 每杯咖啡的附加口味。属于值对象模型。
 * <p>
 * Created by lijingyao on 2018/7/8 22:20.
 */
public final class AdditionalTasteVO {

    // 糖分含量
    private SugarEnums sugar;

    // 牛奶含量
    private MilkEnums milk;

    // 咖啡浓度，附加
    private int espresso;

    // 咖啡因含量
    private CaffeineEnum coffeine;

    public AdditionalTasteVO() {
    }

    public AdditionalTasteVO(int espresso) {
        this.espresso = espresso;
    }

    public AdditionalTasteVO(SugarEnums sugar, MilkEnums milk, int espresso, CaffeineEnum coffeine) {
        this.sugar = sugar;
        this.milk = milk;
        this.espresso = espresso;
        this.coffeine = coffeine;
    }

    public AdditionalTasteVO(int espresso, String milk, String sugar, String coffeine) {

        if (StringUtils.isNoneEmpty(milk)) {
            this.milk = MilkEnums.valueOf(milk);
        }
        if (StringUtils.isNoneEmpty(sugar)) {
            this.sugar = SugarEnums.valueOf(sugar);
        }
        if (StringUtils.isNoneEmpty(coffeine)) {
            this.coffeine = CaffeineEnum.valueOf(coffeine);
        }

        this.espresso = espresso;
    }

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

    public long additionalPrice() {//TODO you can add more calculate rules
        if (espresso > 0) {
            return espresso * 4;
        } else {
            return 0;
        }
    }


}
