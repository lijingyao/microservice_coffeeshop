package com.lijingyao.microservice.coffee.template.trade;

import java.util.List;

/**
 * Created by lijingyao on 2018/7/9 09:50.
 */
public class OrderCreateDTO {

    private List<OrderDetailCreateDTO> details;

    private Long userId;

    public List<OrderDetailCreateDTO> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetailCreateDTO> details) {
        this.details = details;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
