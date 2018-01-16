package com.buzheng.me;

import com.buzheng.me.userholder.UserHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by buzheng on 18/1/16.
 */
@Aspect
@Component
public class AuthorityAspect {

    @Pointcut("within(com.buzheng.me.controller.admin.*)")
    public void author() {
    }

    @Before("author()")
    public void checkAuthority() {
        boolean isAdmin = UserHolder.isAdmin();
//        if (!isAdmin) {
//            throw new RuntimeException("you have no perssmion to login the backend");
//        }
    }
}
