package com.lijingyao.microservice.coffee.base.durid.entity;

import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

/**
 * Created by lijingyao on 2018/7/8 20:15.
 */
@Configurable
public class UtcTimeLongEntityListener {

    @PrePersist
    public void touchForCreate(UtcTimeLongIdEntity entity) {
        if (entity.getUtcCreate() == null || entity.getUtcModified() == null) {
            Instant now = Instant.now();
            entity.setUtcCreate(now);
            entity.setUtcModified(now);
        }
    }

    @PreUpdate
    public void touchForUpdate(UtcTimeLongIdEntity target) {
        target.setUtcModified(Instant.now());
    }
}
