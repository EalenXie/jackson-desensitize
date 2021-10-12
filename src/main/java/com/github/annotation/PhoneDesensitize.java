package com.github.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.github.desensitization.PhoneDesensitization;

import java.lang.annotation.*;

/**
 * Created by EalenXie on 2021/10/8 11:30
 * 电话脱敏 注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@Desensitize(desensitization = PhoneDesensitization.class)
@Documented
public @interface PhoneDesensitize {
}