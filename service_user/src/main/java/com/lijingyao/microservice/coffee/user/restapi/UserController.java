package com.lijingyao.microservice.coffee.user.restapi;

import com.lijingyao.microservice.coffee.template.ServiceResult;
import com.lijingyao.microservice.coffee.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户基础信息的资源
 * <p>
 * Created by lijingyao on 2017/1/3 22:56.
 */
@RestController
@RequestMapping("/users")
public class UserController {


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    /**
     * 获取用户基础信息
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{userId}/miniInfo", method = {RequestMethod.GET})
    public ResponseEntity getMiniUserInfo(@PathVariable("userId") Long userId) {
        return new ResponseEntity(new ServiceResult<>(), HttpStatus.OK);
    }



}
