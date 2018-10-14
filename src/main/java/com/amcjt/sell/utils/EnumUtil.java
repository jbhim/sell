package com.amcjt.sell.utils;

import com.amcjt.sell.enums.CodeEnum;

/**
 * @author jbhim
 * @date 2018/6/7/007.
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
