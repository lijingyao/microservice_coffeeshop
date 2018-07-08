package com.lijingyao.microservice.coffee.user.errors;


import com.lijingyao.microservice.coffee.base.rest.Errors;

/**
 * Created by lijingyao on 2018/7/8 19:52.
 */
public class UserErrors {

    public static Errors USER_REGISTER_INFO_NULL = new Errors(10001,"用户注册信息为空");
    public static Errors USER_INFO_NOT_EXIST = new Errors(10002,"用户信息不存在");



}
