package com.lijingyao.microservice.coffee.user.service.validators;

import com.lijingyao.microservice.coffee.base.validators.BaseValidator;
import com.lijingyao.microservice.coffee.template.users.UserRegisterDTO;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

/**
 * Created by lijingyao on 2018/8/7 10:05.
 */
@Component
public class UserValidator implements BaseValidator {

    private static final int USER_NAME_MAX_LEN = 20;

    // validate user name,phone
    public Predicate<UserRegisterDTO> validateUserRegisterDTO() {
        return p -> p != null
                && validateStringLengths(USER_NAME_MAX_LEN).test(p.getNickName())
                && validateMobile().test(p.getMobilePhone());
    }
}
