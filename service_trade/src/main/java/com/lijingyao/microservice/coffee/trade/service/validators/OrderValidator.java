package com.lijingyao.microservice.coffee.trade.service.validators;

import com.lijingyao.microservice.coffee.base.validators.BaseValidator;
import com.lijingyao.microservice.coffee.template.trade.OrderCreateDTO;
import com.lijingyao.microservice.coffee.template.trade.OrderDetailCreateDTO;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

/**
 * Created by lijingyao on 2018/8/7 10:09.
 */
@Component
public class OrderValidator implements BaseValidator{


    public Predicate<OrderCreateDTO> validateOrderCreateDTO() {
        return p -> p != null
                && CollectionUtils.isNotEmpty(p.getDetails())
                && p.getDetails().parallelStream().allMatch(validateOrderDetailCreateDTO()); // validate all details
    }

    public Predicate<OrderDetailCreateDTO> validateOrderDetailCreateDTO() {
        return p -> p != null && validateInt().test(p.getItemId())
                && validateLong().test(p.getQuantity());
    }

}
