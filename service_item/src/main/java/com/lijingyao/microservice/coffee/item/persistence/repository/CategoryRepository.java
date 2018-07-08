package com.lijingyao.microservice.coffee.item.persistence.repository;

import com.lijingyao.microservice.coffee.item.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lijingyao on 2018/7/8 22:30.
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
