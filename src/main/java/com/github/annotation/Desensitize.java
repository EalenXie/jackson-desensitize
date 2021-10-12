package com.github.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.desensitization.Desensitization;
import com.github.serializer.ObjectDesensitizeSerializer;

import java.lang.annotation.*;

/**
 * Created by EalenXie on 2021/10/8 11:30
 * 对象脱敏 注解
 */
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = ObjectDesensitizeSerializer.class)
@Documented
public @interface Desensitize {
    /**
     * 对象脱敏器实现
     */
    @SuppressWarnings("all")
    Class<? extends Desensitization<?>> desensitization();


}