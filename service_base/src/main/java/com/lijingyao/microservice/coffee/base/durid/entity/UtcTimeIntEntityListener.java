package com.lijingyao.microservice.coffee.base.durid.entity;

import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

/**
 * Created by lijingyao on 2018/7/8 20:25.
 */
@Configurable
public class UtcTimeIntEntityListener {

    @PrePersist
    public void touchForCreate(UtcTimeIntIdEntity entity) {
        if (entity.getUtcCreate() == null || entity.getUtcModified() == null) {
            Instant now = Instant.now();
            entity.setUtcCreate(now);
            entity.setUtcModified(now);
        }
    }

    @PreUpdate
    public void touchForUpdate(UtcTimeIntIdEntity target) {
        target.setUtcModified(Instant.now());
    }
}

