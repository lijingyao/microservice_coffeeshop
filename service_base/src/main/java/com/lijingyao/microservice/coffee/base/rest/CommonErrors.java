package com.lijingyao.microservice.coffee.base.rest;

/**
 * Created by lijingyao on 2018/7/8 23:44.
 */
public class CommonErrors {

    public static Errors SERVICE_ERROR = new Errors(000001,"业务系统错误");

    public static Errors ILLEGAL_PARAM_ERROR = new Errors(000002,"请求参数错误");

}
