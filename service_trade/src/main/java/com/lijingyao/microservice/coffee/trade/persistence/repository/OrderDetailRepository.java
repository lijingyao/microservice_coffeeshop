package com.lijingyao.microservice.coffee.trade.persistence.repository;

import com.lijingyao.microservice.coffee.trade.persistence.entity.TradeOrderDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by lijingyao on 2018/7/8 22:46.
 */
public interface OrderDetailRepository extends JpaRepository<TradeOrderDetail, Long> {

    @Query(" from TradeOrderDetail n where n.mainOrderId in (:mainOrderIds) " +
            "group by n.mainOrderId ")
    List<TradeOrderDetail> findByMainOrderIds(@Param("mainOrderIds") List<String> mainOrderIds, Pageable pageable);
}