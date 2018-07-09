package com.lijingyao.microservice.coffee.template.trade;

import java.util.List;

/**
 * Created by lijingyao on 2018/7/9 09:53.
 */
public class OrderDTO {

    private List<OrderDetailDTO> details;

    private Long userId;

    private Long createTime;

    private String orderId;

    private Long totalPrice;

    public List<OrderDetailDTO> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetailDTO> details) {
        this.details = details;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
