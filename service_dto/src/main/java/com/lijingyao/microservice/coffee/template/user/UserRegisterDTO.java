package com.lijingyao.microservice.coffee.template.user;

/**
 * Created by lijingyao on 2018/7/8 19:44.
 */
public class UserRegisterDTO {


    private String nickName;

    private String mobilePhone;


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
