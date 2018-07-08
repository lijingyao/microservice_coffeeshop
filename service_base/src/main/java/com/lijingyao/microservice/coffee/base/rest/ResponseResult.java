package com.lijingyao.microservice.coffee.base.rest;

/**
 * Created by lijingyao on 2018/7/8 23:43.
 */
public class ResponseResult {

    private Object errors;
    private String msg;
    private Object result;
    private Boolean success;

    public ResponseResult() {
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
