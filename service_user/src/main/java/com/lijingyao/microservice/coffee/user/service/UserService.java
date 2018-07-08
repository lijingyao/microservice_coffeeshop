package com.lijingyao.microservice.coffee.user.service;

import com.lijingyao.microservice.coffee.template.ServiceResult;
import com.lijingyao.microservice.coffee.template.user.UserDTO;
import com.lijingyao.microservice.coffee.template.user.UserRegisterDTO;
import com.lijingyao.microservice.coffee.user.errors.UserErrors;
import com.lijingyao.microservice.coffee.user.persistence.entity.UserInfo;
import com.lijingyao.microservice.coffee.user.persistence.repository.UserRepository;
import com.lijingyao.microservice.coffee.user.restapi.assemblers.UserAssembler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by lijingyao on 2017/1/3 22:58.
 */
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAssembler userAssembler;


    public ServiceResult<UserDTO> registedNewUser(UserRegisterDTO userRegisterDTO) {
        ServiceResult<UserDTO> result = new ServiceResult<>();

        Optional<UserInfo> userInfoOps = userAssembler.assembleUserInfo(userRegisterDTO);

        if (!userInfoOps.isPresent()) {
            return result.setErrors(UserErrors.USER_REGISTER_INFO_NULL);
        }

        UserInfo userInfo = userRepository.save(userInfoOps.get());
        UserDTO userDTO = userAssembler.assembleUserDTO(userInfo);

        return result.setResult(userDTO);

    }


}

