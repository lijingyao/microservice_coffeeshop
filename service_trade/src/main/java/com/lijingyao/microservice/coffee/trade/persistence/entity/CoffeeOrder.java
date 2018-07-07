package com.lijingyao.microservice.coffee.trade.persistence.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lijingyao on 2017/11/9 15:18.
 */
@Entity
@Table(name = "coffee_order")
public class CoffeeOrder {


    @Column(name = "utc_create")
    private Date utcCreate; // 创建时间

    @Column(name = "utc_modified")
    private Date utcModified; // 修改时间

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

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
}



