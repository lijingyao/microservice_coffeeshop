package com.lijingyao.microservice.coffee.base.rest;

/**
 * Created by lijingyao on 2018/7/8 23:40.
 */
public class RestTemplateRequestException  extends RuntimeException {

    private int code;
    private String message;
    private Object data;

    public RestTemplateRequestException() {
    }

    public RestTemplateRequestException(int code, String message) {
        this.code = code;
        this.message = message;
    }



    public int getCode() {
        return code;
    }

    public RestTemplateRequestException setCode(int code) {
        this.code = code;
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public RestTemplateRequestException setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public RestTemplateRequestException setData(Object data) {
        this.data = data;
        return this;
    }

    public Errors getErrors() {
        return new Errors(getCode(), getMessage());
    }

}
