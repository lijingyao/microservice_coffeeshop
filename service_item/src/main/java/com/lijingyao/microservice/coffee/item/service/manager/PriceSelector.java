package com.lijingyao.microservice.coffee.item.service.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by lijingyao on 2018/8/7 14:23.
 */
@Component
public class PriceSelector {


    @Autowired
    private List<PriceStrategy> priceStrategies;


    public PriceStrategy handleByPolicy() {
        if (priceStrategies != null) {

            Optional<PriceStrategy> templateOpt = priceStrategies.stream().filter(t -> t.seasonMatch()).findFirst();
            if (templateOpt.isPresent()) {
                return templateOpt.get();
            }
        }
        throw new IllegalArgumentException("Error get price strategy .");
    }
}
