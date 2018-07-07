package com.lijingyao.microservice.coffee.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijingyao on 2018/7/7 14:11.
 */
@RestController
@RequestMapping("/users")
public class UserController {




    @RequestMapping(value = "/users",method = {RequestMethod.GET})
    public ResponseEntity getUser() {
        return new ResponseEntity("", HttpStatus.OK);
    }




}
