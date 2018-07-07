package com.lijingyao.microservice.coffee.trade;

import com.lijingyao.microservice.coffee.base.BaseApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lijingyao on 2018/7/7 16:01.
 */
@EnableTransactionManagement
@SpringBootApplication
public class TradeApp {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{TradeApp.class, BaseApp.class}, args);
    }


}
