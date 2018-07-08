package com.lijingyao.microservice.coffee.base.durid.entity;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

/**
 * Created by lijingyao on 2018/7/8 20:20.
 */
@MappedSuperclass
@EntityListeners({UtcTimeIntEntityListener.class})
public class UtcTimeIntIdEntity extends IntIdEntity {

    @Column(name = "utc_create")
    @Convert(converter = EntityInstantConverter.class)
    private Instant utcCreate;

    @Column(name = "utc_modified")
    @Convert(converter = EntityInstantConverter.class)
    private Instant utcModified;

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
