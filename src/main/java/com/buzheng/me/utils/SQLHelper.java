package com.buzheng.me.utils;

/**
 * Created by buzheng on 18/1/15.
 * 数据库SQL生成工具类
 */
public class SQLHelper {
    /**
     * 生成SQL的values
     *
     * @param values
     * @return
     */
    public static String buildValues(Object... values) {
        StringBuilder sqlValuesBuilder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (i == values.length - 1) {
                sqlValuesBuilder.append("','").append(values[i]).append("'");
            } else if (i == 0) {
                sqlValuesBuilder.append("'").append(values[i]);
            } else {
                sqlValuesBuilder.append("','").append(values[i]);
            }
        }
        return sqlValuesBuilder.toString();
    }
}
