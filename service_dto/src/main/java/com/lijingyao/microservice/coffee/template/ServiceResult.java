package com.lijingyao.microservice.coffee.template;

import java.io.Serializable;

/**
 * Created by lijingyao on 2018/7/8 19:30.
 */
public class ServiceResult<T> implements Serializable {


    private T result;

    private String message;
    private Integer errorCode;


    public ServiceResult() {
    }

    public ServiceResult(T result) {
        this.result = result;
    }

    public ServiceResult(Integer errorCode, String message) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    public boolean isSuccess() {
        return errorCode != null && errorCode > 0;
    }

}
