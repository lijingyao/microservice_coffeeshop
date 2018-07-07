package com.lijingyao.microservice.coffee.trade.persistence.repository;

import com.lijingyao.microservice.coffee.trade.persistence.entity.TradeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lijingyao on 2018/7/7 13:33.
 */
public interface OrderRepository extends JpaRepository<TradeOrder, Long> {
}
