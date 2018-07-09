package com.lijingyao.microservice.coffee.template.items;

import java.util.List;

/**
 * Created by lijingyao on 2018/7/9 10:06.
 */
public class OrderItemDTO {


    private List<OrderItemDetailDTO> detailDTOS;


    public List<OrderItemDetailDTO> getDetailDTOS() {
        return detailDTOS;
    }

    public void setDetailDTOS(List<OrderItemDetailDTO> detailDTOS) {
        this.detailDTOS = detailDTOS;
    }
}
