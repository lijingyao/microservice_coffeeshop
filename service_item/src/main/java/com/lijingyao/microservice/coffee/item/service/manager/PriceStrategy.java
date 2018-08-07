package com.lijingyao.microservice.coffee.item.service.manager;

import com.lijingyao.microservice.coffee.item.persistence.vo.AdditionalTasteVO;

/**
 * Created by lijingyao on 2018/8/7 14:19.
 */
public interface PriceStrategy {

    long calculatePrice(AdditionalTasteVO tasteVO);

    boolean seasonMatch();
}
