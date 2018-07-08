package com.lijingyao.microservice.coffee.item.errors;


import com.lijingyao.microservice.coffee.base.rest.Errors;

/**
 * Created by lijingyao on 2018/7/8 19:52.
 */
public class ItemErrors {

    public static Errors ITEM_CREATE_INFO_NULL = new Errors(20001,"商品添加信息为空");

    public static Errors ITEM_INFO_NOT_EXIST = new Errors(20002,"商品信息不存在");

    public static Errors CATEGORY_NOT_EXIST = new Errors(20003,"添加商品的类目信息不存在");



}
