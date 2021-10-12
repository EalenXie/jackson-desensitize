package com.github.desensitization;

import com.github.Symbol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by EalenXie on 2021/9/24 15:56
 * 邮箱脱敏器 默认只保留域名
 */
public class EmailDesensitization implements StringDesensitization {

    /**
     * 邮箱正则(半匹配)
     */
    private static final Pattern DEFAULT_PATTERN = Pattern.compile("([A-Za-z0-9_\\-.])+@([A-Za-z0-9_\\-.])+\\.([A-Za-z]{2,4})");

    /**
     * 邮箱脱敏
     */
    @Override
    public String desensitize(String target) {
        Matcher matcher = DEFAULT_PATTERN.matcher(target);
        while (matcher.find()) {
            String group = matcher.group();
            int l = group.lastIndexOf("@");
            target = target.replace(group, Symbol.getSymbol(l, Symbol.STAR) + group.substring(l));
        }
        return target;
    }


}
