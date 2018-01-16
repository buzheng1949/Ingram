package com.buzheng.me.utils;

/**
 * Created by buzheng on 18/1/16.
 * 数字类型判断工具类
 */
public class ParamUtil {

    /**
     * 是否是有效的整型
     *
     * @param id
     * @return
     */
    public static boolean isValidId(Integer id) {
        boolean isValid = Boolean.FALSE;
        if (id == null || id <= 0) {
            return isValid;
        }
        isValid = Boolean.TRUE;
        return isValid;
    }

    /**
     * 是否是有效的Long类型
     *
     * @param id
     * @return
     */
    public static boolean isValidId(Long id) {
        boolean isValid = Boolean.FALSE;
        if (id == null || id <= 0) {
            return isValid;
        }
        isValid = Boolean.TRUE;
        return isValid;
    }
}
