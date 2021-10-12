package com.github.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.github.desensitization.EmailDesensitization;

import java.lang.annotation.*;

/**
 * Created by EalenXie on 2021/10/8 11:30
 * 邮箱脱敏 注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@Desensitize(desensitization = EmailDesensitization.class)
@Documented
public @interface EmailDesensitize {
}