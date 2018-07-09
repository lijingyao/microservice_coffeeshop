package com.lijingyao.microservice.coffee.trade.errors;

import com.lijingyao.microservice.coffee.base.rest.Errors;

/**
 * Created by lijingyao on 2018/7/8 23:29.
 */
public class TradeError {

    public static Errors ORDER_DETAIL_NOT_EXIST = new Errors(30001,"订单中没有商品");
    public static Errors ITEM_QUANTITY_NOT_ENOUGH = new Errors(30002,"商品库存不足，无法下单");

}
