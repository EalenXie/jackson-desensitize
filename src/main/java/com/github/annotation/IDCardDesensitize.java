package com.github.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.github.desensitization.IDCardDesensitization;

import java.lang.annotation.*;

/**
 * Created by EalenXie on 2021/10/8 11:30
 * 中华人民共和国身份证 脱敏注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@Desensitize(desensitization = IDCardDesensitization.class)
@Documented
public @interface IDCardDesensitize {
}
