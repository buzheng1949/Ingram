package com.buzheng.me.userholder;

/**
 * Created by buzheng on 18/1/16.
 * 用户登录信息管理
 */
public class UserHolder {

    public static final String USER_ADMIN = "root";

    private static ThreadLocal<String> userHolderThreadLocal = new ThreadLocal<>();

    /**
     * 获取登录用户信息
     *
     * @return
     */
    public static String getLoginUser() {
        return userHolderThreadLocal.get();
    }

    /**
     * 粗略判断是否是管理员
     *
     * @return
     */
    public static boolean isAdmin() {
        boolean result = Boolean.FALSE;
        String loginUser = getLoginUser();
        if (USER_ADMIN.equals(loginUser)) {
            result = Boolean.TRUE;
        }
        return result;
    }
}
