package com.lijingyao.microservice.coffee.user;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

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

    @NotNull
    @Type(type = "uuid-char")
    private UUID uuid;

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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
