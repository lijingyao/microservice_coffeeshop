package com.lijingyao.microservice.coffee.trade.restapi;

import com.lijingyao.microservice.coffee.trade.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijingyao on 2018/7/8 23:33.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


}
