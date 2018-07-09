package com.lijingyao.microservice.coffee.base;

import com.lijingyao.microservice.coffee.base.durid.conf.EnableDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lijingyao on 2018/7/7 12:35.
 */
@EnableEurekaClient
@EnableDataSource
@EnableTransactionManagement
@SpringBootApplication
public class BaseApp {


}
