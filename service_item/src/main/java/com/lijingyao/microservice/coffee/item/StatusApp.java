package com.lijingyao.microservice.coffee.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lijingyao on 2017/7/13 17:01.
 */
@EnableTransactionManagement
@SpringBootApplication
public class StatusApp {

    public static void main(String[] args) {
        SpringApplication.run(StatusApp.class, args);
    }


}
