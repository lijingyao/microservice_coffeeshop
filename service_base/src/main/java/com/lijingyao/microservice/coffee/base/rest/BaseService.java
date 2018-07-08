package com.lijingyao.microservice.coffee.base.rest;

import java.util.function.Supplier;

/**
 * Created by lijingyao on 2018/7/8 20:51.
 */
public abstract class BaseService {


    public final ServiceResult getResult() {

        return create(ServiceResult::new);
    }

    private ServiceResult create(final Supplier<ServiceResult> supplier) {

        return supplier.get();
    }
}
