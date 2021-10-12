package com.github;

/**
 * Created by EalenXie on 2021/9/24 16:19
 */
public class Symbol {


    /**
     * '*'脱敏符
     */
    public static final String STAR = "*";

    private Symbol() {

    }

    /**
     * 获取符号 例如 getSymbol(5,"*") -> *****
     *
     * @param number 符号个数
     * @param symbol 符号
     */
    public static String getSymbol(int number, String symbol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }
}
