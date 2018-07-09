package com.lijingyao.microservice.coffee.trade.persistence.repository;

import com.lijingyao.microservice.coffee.trade.persistence.entity.TradeOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lijingyao on 2018/7/8 22:46.
 */
public interface OrderDetailRepository extends JpaRepository<TradeOrderDetail, Long> {

}
