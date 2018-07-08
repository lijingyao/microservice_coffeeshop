package com.lijingyao.microservice.coffee.template.user;

/**
 * Created by lijingyao on 2018/7/8 19:35.
 */
public class UserDTO {

    private Long userId;

    private Long registeredTime;


    private String nickName;

    private String mobilePhone;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Long registeredTime) {
        this.registeredTime = registeredTime;
    }

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
