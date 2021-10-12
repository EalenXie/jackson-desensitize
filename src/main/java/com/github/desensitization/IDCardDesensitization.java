package com.github.desensitization;

import com.github.Symbol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by EalenXie on 2021/9/24 15:56
 * 身份证(18位和15位) 脱敏器
 */
public class IDCardDesensitization implements StringDesensitization {


    /**
     * 15位身份证号正则
     */
    private static final Pattern PATTERN15 = Pattern.compile("^([1-9][0-9]{5}[0-9]{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)[0-9]{3})$");
    /**
     * 18位身份证号正则
     */
    private static final Pattern PATTERN18 = Pattern.compile("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

    /**
     * 身份证脱敏(18位和15位)
     */
    @Override
    public String desensitize(String target) {
        target = desensitize(PATTERN18, target);
        return desensitize(PATTERN15, target);
    }

    /**
     * 默认只保留前4位和后4位
     *
     * @param pattern 匹配正则
     */
    private String desensitize(Pattern pattern, String target) {
        if (target != null) {
            Matcher matcher = pattern.matcher(target);
            int start = 4;
            int last = target.length() - 4;
            while (matcher.find()) {
                target = target.replace(target, target.substring(0, start) + Symbol.getSymbol(last, Symbol.STAR) + target.substring(last));
            }
        }
        return target;
    }


}
