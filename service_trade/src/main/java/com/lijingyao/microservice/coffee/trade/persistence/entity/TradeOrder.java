package com.lijingyao.microservice.coffee.trade.persistence.entity;

import com.lijingyao.microservice.coffee.base.durid.entity.UtcTimeLongIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by lijingyao on 2018/7/8 22:18.
 */
@Entity
@Table(name = "trade_order")
public class TradeOrder extends UtcTimeLongIdEntity {

    @NotNull
    @Column(name = "order_id", length = 64)
    private String orderId;

    @Column(name = "user_id")
    private Long userId;

    // 总价
    @Column(name = "payment_price")
    private Long paymentPrice;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Long paymentPrice) {
        this.paymentPrice = paymentPrice;
    }
}



