package com.lijingyao.microservice.coffee.trade.restapi;

import com.lijingyao.microservice.coffee.template.trade.OrderCreateDTO;
import com.lijingyao.microservice.coffee.trade.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lijingyao on 2018/7/8 23:33.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 添加新的商品
     */
    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity orderCreative(@RequestBody OrderCreateDTO createDTO) {
        return new ResponseEntity(orderService.createOrder(createDTO), HttpStatus.OK);
    }


    @RequestMapping(value = "/users/{userId}", method = {RequestMethod.GET})
    public ResponseEntity getItem(@PathVariable("userId") Long userId, @RequestParam("orderSize") Integer orderSize, @RequestParam("detailOrderSize") Integer detailOrderSize) {
        return new ResponseEntity(orderService.getNewUserOrders(userId, orderSize, detailOrderSize), HttpStatus.OK);
    }


}
