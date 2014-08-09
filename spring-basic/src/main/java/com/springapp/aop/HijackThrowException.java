package com.springapp.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author humayun
 */
public class HijackThrowException implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HijackThrowException : Throw exception hijacked!");
    }
}
