package com.lijingyao.microservice.coffee.base.rest;

import java.io.Serializable;

/**
 * Created by lijingyao on 2018/7/8 19:53.
 */
public class Errors implements Serializable {

    private int code;
    private String comment;


    public Errors(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Errors errors = (Errors) o;
        return code == errors.code;
    }

    @Override
    public int hashCode() {
        return code;
    }

    @Override
    public String toString() {
        return String.format("%04d", code);
    }

}
