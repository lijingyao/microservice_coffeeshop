package com.lijingyao.microservice.coffee.base.durid.entity;

import javax.persistence.*;

/**
 * Created by lijingyao on 2018/7/8 20:16.
 */
@MappedSuperclass
public abstract class LongIdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
