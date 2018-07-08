package com.lijingyao.microservice.coffee.base.durid.entity;

import javax.persistence.*;

/**
 * Created by lijingyao on 2018/7/8 20:19.
 */
@MappedSuperclass
public abstract class IntIdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
