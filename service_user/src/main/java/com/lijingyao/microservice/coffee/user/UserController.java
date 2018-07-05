package com.lijingyao.microservice.coffee.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijingyao on 2017/2/18 19:42.
 */
@RestController
@RequestMapping("/users")
public class UserController {



    /**
     * 获取全部banner地址
     * @return
     */
    @RequestMapping(value = "/users",method = {RequestMethod.GET})
    public ResponseEntity getUser() {
        return new ResponseEntity("sss", HttpStatus.OK);
    }




}
