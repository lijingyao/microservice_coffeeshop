package com.lijingyao.microservice.coffee.base.validators;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by lijingyao on 2018/8/7 09:32.
 */
public interface BaseValidator<T> {

    default Predicate<T> notNullParam(final Object... t) {
        return p -> (null != p) && (null != t) && Stream.of(t).allMatch(object -> object != null);
    }

    default Predicate<T[]> notNullArray() {
        return p -> p != null && 0 < p.length && Stream.of(p).allMatch(object -> object != null);
    }

    default Predicate<List<T>> notNullList() {
        return p -> p != null && !p.isEmpty() && p.stream().allMatch(obj -> null != obj);
    }

    default Predicate<T> notNull() {

        return p -> (null != p);
    }

    default Predicate<Integer> validateInt() {
        return p -> null != p && p > 0;
    }

    default Predicate<Long> validateLong() {
        return p -> null != p && p > 0;
    }

    default Predicate<String> validateString() {
        return p -> StringUtils.isNotEmpty(p);
    }

    default Predicate<String> validateStringLengths(int len) {
        return p -> validateString().test(p) && p.length() < len;
    }

    default Predicate<Object[]> validateArray() {
        return p -> (null != p) && Stream.of(p).allMatch(object -> object != null);
    }

    default Predicate<String> validateMobile() {
        return p -> StringUtils.isNotEmpty(p) && Pattern.matches("1[34578]\\d{9}$", p);
    }



}
