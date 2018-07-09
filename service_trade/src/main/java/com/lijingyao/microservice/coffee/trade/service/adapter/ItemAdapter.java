package com.lijingyao.microservice.coffee.trade.service.adapter;

import com.lijingyao.microservice.coffee.base.rest.BaseRestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lijingyao on 2018/7/8 23:38.
 */
@Component
public class ItemAdapter extends BaseRestTemplate{


    private static final Logger logger = LoggerFactory.getLogger(ItemAdapter.class);

    @Autowired
    private RestTemplate restTemplate;

    // 获取根据commodityIds商品信息9
    public static final String OUTPUT_ORDER_PATH = "http://service-item/storage/outputs/orders";

//
//    public ServiceResult<ItemOrderDTO> tradeOrderOutput(OrderItemDTO reduceItemDTO, Long userId) {
//        ServiceResult<ItemOrderDTO> res = new ServiceResult<>();
//
//        try {
//            HttpEntity httpEntity = new HttpEntity(reduceItemDTO);
//            ResponseEntity<ResponseResult> entity = restTemplate.exchange(OUTPUT_ORDER_PATH, HttpMethod.POST, httpEntity, ResponseResult.class);
//
//            return res.setResult((ItemOrderDTO) valueOfResult(entity, ItemOrderDTO.class));
//        } catch (Exception e) {
//            logger.error("Error tradeOrderOutput userId:[{}] .", userId, e);
//            return onErrorReturn(e, res);
//        }
//    }


}
