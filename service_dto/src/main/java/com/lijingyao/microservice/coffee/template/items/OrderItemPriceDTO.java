package com.lijingyao.microservice.coffee.template.items;

import java.util.List;

/**
 * Created by lijingyao on 2018/7/9 10:54.
 */
public class OrderItemPriceDTO {

    private List<OrderItemDetailPriceDTO> priceDTOS;

    public List<OrderItemDetailPriceDTO> getPriceDTOS() {
        return priceDTOS;
    }

    public void setPriceDTOS(List<OrderItemDetailPriceDTO> priceDTOS) {
        this.priceDTOS = priceDTOS;
    }
}
