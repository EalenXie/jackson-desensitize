package com.github.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.github.desensitization.StringDesensitization;

import java.lang.annotation.*;

/**
 * Created by EalenXie on 2021/9/24 17:47
 * 字符脱敏
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@Desensitize(desensitization = StringDesensitization.class)
@Documented
public @interface StringDesensitize {
}
