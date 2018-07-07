package com.lijingyao.microservice.coffee.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by lijingyao on 2018/7/5 14:52.
 */
@Entity
@Table(name = "user_info")
public class User {

    @Column(name = "utc_create")
    private Date utcCreate; // 创建时间

    @Column(name = "utc_modified")
    private Date utcModified; // 修改时间

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * 昵称
     */
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

    public Date getUtcCreate() {
        return utcCreate;
    }

    public void setUtcCreate(Date utcCreate) {
        this.utcCreate = utcCreate;
    }

    public Date getUtcModified() {
        return utcModified;
    }

    public void setUtcModified(Date utcModified) {
        this.utcModified = utcModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


}
