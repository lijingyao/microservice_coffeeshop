package com.lijingyao.microservice.coffee.item.service;

import com.lijingyao.microservice.coffee.base.rest.BaseService;
import com.lijingyao.microservice.coffee.item.persistence.repository.CategoryRepository;
import com.lijingyao.microservice.coffee.item.persistence.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijingyao on 2018/7/8 22:30.
 */
@Service
public class ItemService extends BaseService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;






}
