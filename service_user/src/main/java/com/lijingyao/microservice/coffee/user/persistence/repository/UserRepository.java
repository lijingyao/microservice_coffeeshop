package com.lijingyao.microservice.coffee.user.persistence.repository;

import com.lijingyao.microservice.coffee.user.persistence.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lijingyao on 2018/7/7 13:41.
 */
public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
