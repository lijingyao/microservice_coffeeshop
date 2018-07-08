package com.lijingyao.microservice.coffee.user.persistence.entity;

import com.lijingyao.microservice.coffee.base.durid.entity.UtcTimeLongIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by lijingyao on 2018/7/5 14:52.
 */
@Entity
@Table(name = "user_info")
public class UserInfo extends UtcTimeLongIdEntity {



    @NotNull
    @Column(name = "nickname", length = 64)
    private String nickName;


    @Column(name = "mobile_phone", length = 32)
    private String mobilePhone;


    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


}
