package com.lijingyao.microservice.coffee.trade.service;

import com.lijingyao.microservice.coffee.base.rest.BaseService;
import com.lijingyao.microservice.coffee.base.rest.ServiceResult;
import com.lijingyao.microservice.coffee.template.trade.OrderCreateDTO;
import com.lijingyao.microservice.coffee.template.trade.OrderDTO;
import com.lijingyao.microservice.coffee.trade.persistence.entity.TradeOrder;
import com.lijingyao.microservice.coffee.trade.persistence.entity.TradeOrderDetail;
import com.lijingyao.microservice.coffee.trade.persistence.repository.OrderDetailRepository;
import com.lijingyao.microservice.coffee.trade.persistence.repository.OrderRepository;
import com.lijingyao.microservice.coffee.trade.restapi.assemblers.OrderAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by lijingyao on 2018/7/8 23:33.
 */
@Service
public class OrderService extends BaseService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository detailRepository;
    @Autowired
    private OrderAssembler orderAssembler;


    public ServiceResult<OrderDTO> createOrder(OrderCreateDTO createDTO) {
        ServiceResult<OrderDTO> result = getResult();

//        OrderItemDTO reduceItemDTO = orderAssembler.assembleOrderReduce(createDTO);

        TradeOrder order = orderAssembler.assembleOrder(createDTO);

        Optional<List<TradeOrderDetail>> orderDetails = orderAssembler.assembleDetailOrders(createDTO, order);


        return result;
    }


}
