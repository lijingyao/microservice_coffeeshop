package com.lijingyao.microservice.coffee.trade.restapi;

import com.google.common.collect.Lists;
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


    /**
     * 获取用户最新的主订单列表
     *
     * @param userId
     * @param orderSize
     * @return
     */
    @RequestMapping(value = "/users/{userId}", method = {RequestMethod.GET})
    public ResponseEntity getUserNewOrders(@PathVariable("userId") Long userId, @RequestParam("orderSize") Integer orderSize) {
        return new ResponseEntity(orderService.getUserNewOrders(userId, orderSize), HttpStatus.OK);
    }

    /**
     * 根据主订单Id ,获取子订单。每个主订单只获取一个子订单。
     *
     * @param mainOrderIds 主订单id
     * @return
     */
    @RequestMapping(value = "/details", method = {RequestMethod.GET})
    public ResponseEntity getDetailOrders(@RequestParam("mainOrderIds") String[] mainOrderIds, @RequestParam("orderSize") Integer orderSize) {
        return new ResponseEntity(orderService.getDetailOrders(Lists.newArrayList(mainOrderIds),orderSize), HttpStatus.OK);
    }


}
