package com.lijingyao.microservice.coffee.item.persistence.repository;

import com.lijingyao.microservice.coffee.item.persistence.entity.ItemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lijingyao on 2018/7/8 22:24.
 */
public interface ItemRepository extends JpaRepository<ItemInfo, Integer> {
}
