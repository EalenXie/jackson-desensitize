package com.github.desensitization;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EalenXie on 2021/9/30 16:52
 */
public class DesensitizationFactory {

    private DesensitizationFactory() {
    }

    private static final Map<Class<?>, Desensitization<?>> map = new HashMap<>();

    @SuppressWarnings("all")
    public static Desensitization<?> getDesensitization(Class<?> clazz) {
        if (clazz.isInterface()) {
            throw new UnsupportedOperationException("desensitization is interface, what is expected is an implementation class !");
        }
        return map.computeIfAbsent(clazz, k -> {
            try {
                return (Desensitization<?>) clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new UnsupportedOperationException(e.getMessage(), e);
            }
        });
    }

}
