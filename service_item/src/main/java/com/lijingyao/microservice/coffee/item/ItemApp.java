package com.lijingyao.microservice.coffee.item;

import com.lijingyao.microservice.coffee.base.BaseApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lijingyao on 2017/7/13 17:01.
 */
@EnableTransactionManagement
@SpringBootApplication
public class ItemApp {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{ItemApp.class, BaseApp.class}, args);
    }


}
