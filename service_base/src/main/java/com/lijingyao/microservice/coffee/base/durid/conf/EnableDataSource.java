package com.lijingyao.microservice.coffee.base.durid.conf;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lijingyao on 2018/7/7 12:57.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({DataSourceConfig.class})
public @interface EnableDataSource {
}

