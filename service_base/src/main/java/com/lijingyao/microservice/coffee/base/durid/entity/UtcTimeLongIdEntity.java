package com.lijingyao.microservice.coffee.base.durid.entity;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

/**
 * Created by lijingyao on 2018/7/8 20:14.
 */
@MappedSuperclass
@EntityListeners({UtcTimeLongEntityListener.class})
public abstract class UtcTimeLongIdEntity extends LongIdEntity {

    @Column(name = "utc_create")
    @Convert(converter = EntityInstantConverter.class)
    private Instant utcCreate; // 创建时间

    @Column(name = "utc_modified")
    @Convert(converter = EntityInstantConverter.class)
    private Instant utcModified; // 修改时间

    public void setUtcCreate(Instant utcCreate) {
        this.utcCreate = utcCreate;
    }

    public void setUtcModified(Instant utcModified) {
        this.utcModified = utcModified;
    }

    public Instant getUtcCreate() {
        return utcCreate;
    }

    public Instant getUtcModified() {
        return utcModified;
    }


}
