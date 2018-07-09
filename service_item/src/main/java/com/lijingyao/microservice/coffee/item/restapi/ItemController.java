package com.lijingyao.microservice.coffee.item.restapi;

import com.lijingyao.microservice.coffee.item.service.ItemService;
import com.lijingyao.microservice.coffee.template.items.ItemCreateDTO;
import com.lijingyao.microservice.coffee.template.items.OrderItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lijingyao on 2018/7/8 22:31.
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 添加新的商品
     */
    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity itemCreative(@RequestBody ItemCreateDTO createDTO) {
        return new ResponseEntity(itemService.itemCreative(createDTO), HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    public ResponseEntity getItem(@PathVariable("id") Integer id) {
        return new ResponseEntity(itemService.getItem(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/prices", method = {RequestMethod.POST})
    public ResponseEntity buildItemOrderPrice(@RequestBody OrderItemDTO itemDTO) {
        return new ResponseEntity(itemService.buildItemOrderPrice(itemDTO), HttpStatus.OK);
    }


}
