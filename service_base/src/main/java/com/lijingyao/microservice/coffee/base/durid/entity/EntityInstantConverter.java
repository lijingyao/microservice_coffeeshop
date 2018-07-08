package com.lijingyao.microservice.coffee.base.durid.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Instant;
import java.util.Date;

/**
 * Created by lijingyao on 2018/7/8 20:17.
 */
@Converter(autoApply = true)
public class EntityInstantConverter implements AttributeConverter<Instant, Date> {

    @Override
    public Date convertToDatabaseColumn(Instant date) {
        if(date!= null){
            Instant instant = Instant.from(date);
            return Date.from(instant);
        }
        return null;
    }

    @Override
    public Instant convertToEntityAttribute(Date value) {
        if(value != null) {
            Instant instant = value.toInstant();
            return instant;
        }
        return null;
    }
}
