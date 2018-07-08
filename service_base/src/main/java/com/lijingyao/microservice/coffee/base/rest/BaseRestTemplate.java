package com.lijingyao.microservice.coffee.base.rest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.stream.Collectors;

/**
 * Created by lijingyao on 2018/7/8 23:39.
 */
public class BaseRestTemplate {

    private static final Logger logger = LoggerFactory.getLogger(BaseRestTemplate.class);

    protected Object valueOfResult(ResponseEntity<ResponseResult> responseEntity, Class clazz) {


        if (responseEntity.getBody() == null) {
            RestTemplateRequestException exception = new RestTemplateRequestException(CommonErrors.SERVICE_ERROR.getCode(), CommonErrors.SERVICE_ERROR.getComment());
            logger.error("Error to serialize service response body, body null.", exception);
            throw exception;
        }
        return convertResult(responseEntity, clazz);


    }


    private Object convertResult(ResponseEntity<ResponseResult> responseEntity, Class clazz) {
        ResponseResult contentObject = JSONObject.parseObject(responseEntity.getBody().toString(), ResponseResult.class);

        Object data = contentObject.getResult();
        ServiceResult serviceResult = new ServiceResult();

        HttpStatus status = HttpStatus.OK;

        if (HttpStatus.OK.equals(status)) {
            if (data != null) {
                if (data instanceof JSONObject) {
                    serviceResult.setResult(TypeUtils.castToJavaBean(data, clazz));
                } else if (data instanceof JSONArray) {
                    JSONArray array = JSONArray.class.cast(data);
                    serviceResult.setResult(array.stream().map(o -> TypeUtils.castToJavaBean(o, clazz)).collect(Collectors.toList()));
                } else if (data.getClass().equals(clazz)) {
                    serviceResult.setResult(data);
                }
            } else {
                serviceResult.setResult(data);
            }
        }


        if (!serviceResult.isSuccess()) {
            Errors errors = TypeUtils.castToJavaBean(contentObject.getErrors(), Errors.class);
            RestTemplateRequestException exception = new RestTemplateRequestException(errors.getCode(), errors.getComment());
            logger.error("Translator error. {}", serviceResult.getMessage(), exception);
            throw exception;
        } else {
            return serviceResult.getResult();
        }
    }


    public static ServiceResult onErrorReturn(Throwable e, ServiceResult result) {
        if (result == null) {
            result = new ServiceResult<>();
        }

        if (e instanceof RestTemplateRequestException) {
            Errors errors = ((RestTemplateRequestException) e).getErrors();
            logger.error("Service Error ,Error Code :[{}] .", errors.getCode(), e);
            return result.setErrors(errors);
        } else {
            logger.error("Service Error .", e);
            return result.setErrors(CommonErrors.SERVICE_ERROR);
        }
    }
}
