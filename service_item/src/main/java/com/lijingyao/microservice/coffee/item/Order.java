package com.lijingyao.microservice.coffee.item;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by lijingyao on 2017/11/9 15:18.
 */
@Entity
@Table(name = "order_test")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "order_id")
    private Integer orderId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
