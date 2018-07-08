package com.lijingyao.microservice.coffee.base;

import com.lijingyao.microservice.coffee.base.durid.conf.EnableDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lijingyao on 2018/7/7 12:35.
 */
@EnableDataSource
@EnableTransactionManagement
@SpringBootApplication
public class BaseApp {


}
