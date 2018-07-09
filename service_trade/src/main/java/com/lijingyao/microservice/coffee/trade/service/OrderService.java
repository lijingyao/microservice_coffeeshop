package com.lijingyao.microservice.coffee.trade.service;

import com.lijingyao.microservice.coffee.base.rest.BaseService;
import com.lijingyao.microservice.coffee.base.rest.ServiceResult;
import com.lijingyao.microservice.coffee.template.trade.OrderCreateDTO;
import com.lijingyao.microservice.coffee.template.trade.OrderDTO;
import com.lijingyao.microservice.coffee.trade.persistence.repository.OrderRepository;
import com.lijingyao.microservice.coffee.trade.restapi.assemblers.OrderAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijingyao on 2018/7/8 23:33.
 */
@Service
public class OrderService extends BaseService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderAssembler orderAssembler;


    public ServiceResult<OrderDTO> createOrder(OrderCreateDTO createDTO) {
        ServiceResult<OrderDTO> result = getResult();


        return result;
    }


}
