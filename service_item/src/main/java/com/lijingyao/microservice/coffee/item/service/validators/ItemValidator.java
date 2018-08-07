package com.lijingyao.microservice.coffee.item.service.validators;

import com.lijingyao.microservice.coffee.base.validators.BaseValidator;
import com.lijingyao.microservice.coffee.item.persistence.vo.CaffeineEnum;
import com.lijingyao.microservice.coffee.item.persistence.vo.MilkEnums;
import com.lijingyao.microservice.coffee.item.persistence.vo.SugarEnums;
import com.lijingyao.microservice.coffee.template.items.ItemCreateDTO;
import com.lijingyao.microservice.coffee.template.items.OrderItemDTO;
import com.lijingyao.microservice.coffee.template.items.OrderItemDetailDTO;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

/**
 * Created by lijingyao on 2018/8/7 09:31.
 */
@Component
public class ItemValidator implements BaseValidator {

    private static final int COFFEE_NAME_MAX_LEN = 10;

    // validate price,name,catId effective
    public Predicate<ItemCreateDTO> validateItemCreateDTO() {
        return p -> p != null && validateLong().test(p.getPrice())
                && validateStringLengths(COFFEE_NAME_MAX_LEN).test(p.getName())
                && validateInt().test(p.getCatId());
    }

    public Predicate<OrderItemDTO> validateOrderItemDTO() {
        return p -> p != null
                && CollectionUtils.isNotEmpty(p.getDetailDTOS())
                && p.getDetailDTOS().parallelStream().allMatch(validateOrderItemDetailDTO()); // validate all item details
    }

    public Predicate<OrderItemDetailDTO> validateOrderItemDetailDTO() throws IllegalArgumentException{
        return p -> p != null && validateInt().test(p.getItemId())
                && validateLong().test(p.getQuantity())
                && (p.getSugar() != null && SugarEnums.valueOf(p.getSugar()) != null)
                && (p.getMilk() != null && MilkEnums.valueOf(p.getMilk()) != null)
                && (p.getCoffeine() != null && CaffeineEnum.valueOf(p.getCoffeine()) != null);
    }
}