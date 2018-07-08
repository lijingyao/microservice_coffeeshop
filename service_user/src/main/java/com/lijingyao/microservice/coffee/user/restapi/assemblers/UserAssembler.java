package com.lijingyao.microservice.coffee.user.restapi.assemblers;

import com.lijingyao.microservice.coffee.template.users.UserDTO;
import com.lijingyao.microservice.coffee.template.users.UserRegisterDTO;
import com.lijingyao.microservice.coffee.user.persistence.entity.UserInfo;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by lijingyao on 2018/7/8 19:45.
 */
@Component
public class UserAssembler {


    private BeanCopier userCopier = BeanCopier.create(UserRegisterDTO.class, UserInfo.class, false);
    private BeanCopier userDTOCopier = BeanCopier.create(UserInfo.class, UserDTO.class, false);


    public Optional<UserInfo> assembleUserInfo(UserRegisterDTO userRegisterDTO) {
        if (null == userRegisterDTO) return Optional.empty();

        UserInfo userInfo = new UserInfo();
        userCopier.copy(userRegisterDTO, userInfo, null);
        return Optional.of(userInfo);
    }


    public UserDTO assembleUserDTO(UserInfo userInfo) {

        UserDTO userDTO = new UserDTO();
        userDTOCopier.copy(userInfo, userDTO, null);
        userDTO.setRegisteredTime(userInfo.getUtcCreate().toEpochMilli());
        userDTO.setUserId(userInfo.getId());
        return userDTO;

    }

}
