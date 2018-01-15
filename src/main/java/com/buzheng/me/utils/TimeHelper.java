package com.buzheng.me.utils;

/**
 * Created by buzheng on 18/1/15.
 * 时间获取工具类
 */
public class TimeHelper {
    /**
     * 获取当前时间
     *
     * @return 返回当前时间 秒级别
     */
    public static Integer getCurrentTime() {
        Long currentTime = System.currentTimeMillis();
        return Integer.parseInt(String.valueOf(currentTime));
    }
}
