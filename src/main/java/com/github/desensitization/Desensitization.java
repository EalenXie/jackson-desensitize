package com.github.desensitization;

/**
 * Created by EalenXie on 2021/9/24 15:52
 * 顶级的脱敏器
 */
public interface Desensitization<T> {


    /**
     * 脱敏实现
     *
     * @param target 脱敏对象
     * @return 脱敏返回结果
     */
    T desensitize(T target);

}
